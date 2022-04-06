package vn.ansv.Controller.Chief;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Chief_HomeController")
public class ChiefController extends ChiefBaseController {
	
	@RequestMapping(value = { "/chief/dashboard/{week}_{year}" }, method = RequestMethod.GET)
	public ModelAndView chief_home(@PathVariable int week, @PathVariable int year) {
		int level_1 = 1, level_2 = 2;
		int type_1 = 1, type_2 = 2, type_3 = 3;
		
		_mvShare.addObject("statistic", _ceoService.getStatistic(week, year));
		// Dữ liệu khái quát hiển thị lên dashboard (datatable)
		_mvShare.addObject("deployment_project", _ceoService.getDashboardTable(type_1, level_2, week, year));
		_mvShare.addObject("telecom_project", _ceoService.getDashboardTable(type_2, level_1, week, year));
		_mvShare.addObject("digital_transfer_project", _ceoService.getDashboardTable(type_3, level_1, week, year));
		_mvShare.setViewName("chief/chief_dashboard");
		
		return _mvShare;
	}
	
	@RequestMapping(value = { "/chief/detail/{type}_{id}" }, method = RequestMethod.GET)
	public ModelAndView view_detail(@PathVariable int type, @PathVariable int id) {
		
		if (type == 1) {
			_mvShare.addObject("project_detail", _ceoService.getProjectDetailLevel2(id));
		} else {
			_mvShare.addObject("project_detail", _ceoService.getProjectDetailLevel1(id));
		}
		_mvShare.setViewName("chief/project_detail");
		
		return _mvShare;
	}
}

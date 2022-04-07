package vn.ansv.Controller.Chief;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Chief_HomeController")
public class ChiefController extends ChiefBaseController {
	
	@RequestMapping(value = { "/chief/dashboard/{week}_{year}" }, method = RequestMethod.GET)
	public ModelAndView chief_home(@PathVariable int week, @PathVariable int year, HttpSession session) {
		
		session.setAttribute("week", week);
		session.setAttribute("year", year);
		
		int level_1 = 1, level_2 = 2;
		int type_1 = 1, type_2 = 2, type_3 = 3;
		
		_mvShare.addObject("statistic", _projectService.getStatistic(week, year)); // Dữ liệu thống kê
		
		// Dữ liệu khái quát hiển thị lên dashboard (datatable)
		_mvShare.addObject("deployment_project", _projectService.getDashboardTable(type_1, level_2, week, year));
		_mvShare.addObject("telecom_project", _projectService.getDashboardTable(type_2, level_1, week, year));
		_mvShare.addObject("digital_transfer_project", _projectService.getDashboardTable(type_3, level_1, week, year));
		_mvShare.setViewName("chief/chief_dashboard");
		
		return _mvShare;
	}
	
	@RequestMapping(value = { "/chief/detail/{type}_{id}" }, method = RequestMethod.GET)
	public ModelAndView view_detail(@PathVariable int type, @PathVariable int id) {
		
		_mvShare.addObject("type", type);
		_mvShare.addObject("project_detail", _projectService.getProjectDetail(type, id));
		_mvShare.setViewName("chief/project_detail");
		
		return _mvShare;
	}
	
	@RequestMapping(value = { "/chief/customer" }, method = RequestMethod.GET)
	public ModelAndView view_customer() {
		_mvShare.addObject("customer", _customerService.getAll());
		_mvShare.addObject("customer_new", _customerService.getNews());
		_mvShare.setViewName("chief/customer");
		
		return _mvShare;
	}
	
	@RequestMapping(value = { "/chief/pic" }, method = RequestMethod.GET)
	public ModelAndView view_pic() {
		int enabled_1 = 1, enabled_2 = 0;
		_mvShare.addObject("list_users", _usersService.getAllPic(enabled_1));
		_mvShare.addObject("list_users_ban", _usersService.getAllPic(enabled_2));
		_mvShare.setViewName("chief/pic");
		
		return _mvShare;
	}
}

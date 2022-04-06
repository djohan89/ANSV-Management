package vn.ansv.Controller.Chief;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import vn.ansv.Service.CeoServiceImpl;

@Controller
public class ChiefBaseController {

	@Autowired
	CeoServiceImpl _ceoService;
	
	public ModelAndView _mvShare = new ModelAndView();
	
	public ModelAndView InitCEO(int week, int year) {
		return _mvShare;
	}
	
}

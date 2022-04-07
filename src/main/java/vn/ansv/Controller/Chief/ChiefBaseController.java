package vn.ansv.Controller.Chief;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import vn.ansv.Service.CustomerServiceImpl;
import vn.ansv.Service.ProjectServiceImpl;
import vn.ansv.Service.UsersServiceImpl;

@Controller
public class ChiefBaseController {

	@Autowired
	ProjectServiceImpl _projectService;
	
	@Autowired
	CustomerServiceImpl _customerService;
	
	@Autowired
	UsersServiceImpl _usersService;
	
	public ModelAndView _mvShare = new ModelAndView();
	
	public ModelAndView InitCEO(int week, int year) {
		return _mvShare;
	}
	
}

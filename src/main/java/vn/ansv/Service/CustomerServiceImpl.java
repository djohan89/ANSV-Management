package vn.ansv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ansv.Dao.CustomerDao;
import vn.ansv.Dto.CustomerDto;
import vn.ansv.Service.Interface.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerDao customerDao;

	public List<CustomerDto> getAll() {
		return customerDao.getAll();
	}

	public List<CustomerDto> getNews() {
		return customerDao.getNews();
	}
	
}

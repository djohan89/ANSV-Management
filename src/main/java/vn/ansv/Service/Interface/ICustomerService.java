package vn.ansv.Service.Interface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ansv.Dto.CustomerDto;

@Service
public interface ICustomerService {

	@Autowired
	public List<CustomerDto> getAll();
	public List<CustomerDto> getNews();
	
}

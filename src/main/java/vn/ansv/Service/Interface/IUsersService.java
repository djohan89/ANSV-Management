package vn.ansv.Service.Interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ansv.Dto.UsersDto;

@Service
public interface IUsersService {
	
	@Autowired
	public UsersDto getByUser(String username);

}

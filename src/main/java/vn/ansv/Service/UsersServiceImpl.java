package vn.ansv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ansv.Dao.UsersDao;
import vn.ansv.Dto.UsersDto;
import vn.ansv.Service.Interface.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService {
	
	@Autowired
	private UsersDao usersDao;
	
	public UsersDto getByUser(String username) {
		return usersDao.getByUser(username);
	}

	public List<UsersDto> getAllPic() {
		return usersDao.getAllPic();
	}

}

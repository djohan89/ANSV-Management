package vn.ansv.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.ansv.Dto.UsersDto;
import vn.ansv.Dto.Mapper.UsersDtoMapper;

@Repository
public class UsersDao extends BaseDao {

	private LocalDateTime _now = LocalDateTime.now();
	
	public UsersDto getByUser(String username) {
		String sql = "SELECT users.id, users.staff_code, users.username, role.name AS role, users.display_name, users.created_at "
				+ "FROM users "
				+ "INNER JOIN users_roles on users.id = users_roles.user "
				+ "INNER JOIN role on users_roles.role = role.id "
				+ "WHERE username = ? LIMIT 1";
		return _jdbcTemplate.queryForObject(sql, new UsersDtoMapper() {
			public UsersDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				UsersDto usersDto = new UsersDto();
				
				usersDto.setId(rs.getInt("id"));
				usersDto.setStaff_code(rs.getString("staff_code"));
				usersDto.setUsername(rs.getString("username"));
				usersDto.setRole(rs.getString("role"));
				usersDto.setDisplay_name(rs.getString("display_name"));
				usersDto.setCreated_at(rs.getDate("created_at"));
				
				return usersDto;
			}
		}, username);
	}
	
	public List<UsersDto> getAllPic(int enabled) {
		List<UsersDto> list = new ArrayList<UsersDto>();
		
		String sql = "SELECT users.id, users.staff_code, users.username, role.name AS role, users.display_name, users.enabled, users.created_at "
				+ "FROM users "
				+ "INNER JOIN users_roles on users.id = users_roles.user "
				+ "INNER JOIN role on users_roles.role = role.id "
				+ "WHERE users.enabled = ? GROUP BY users.id";
		
		list = _jdbcTemplate.query(sql, new UsersDtoMapper() {
			public UsersDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				UsersDto usersDto = new UsersDto();
				
				usersDto.setId(rs.getInt("id"));
				usersDto.setStaff_code(rs.getString("staff_code"));
				usersDto.setUsername(rs.getString("username"));
				usersDto.setRole(rs.getString("role"));
				usersDto.setDisplay_name(rs.getString("display_name"));
				usersDto.setEnabled(rs.getInt("enabled"));
				usersDto.setCreated_at(rs.getDate("created_at"));
				
				return usersDto;
			}
		}, enabled);
		
		return list;
	}
	
}

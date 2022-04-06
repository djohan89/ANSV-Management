package vn.ansv.Dto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Dto.UsersDto;

public class UsersDtoMapper implements RowMapper<UsersDto> {

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

}

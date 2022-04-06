package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.Users;

public class UsersMapper implements RowMapper<Users>{

	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users users = new Users();
		
		users.setId(rs.getInt("id"));
		users.setStaff_code(rs.getString("staff_code"));
		users.setUsername(rs.getString("username"));
		users.setPassword(rs.getString("password"));
		users.setDisplay_name(rs.getString("display_name"));
		users.setEnabled(rs.getInt("enabled"));
		users.setCreated_at(rs.getDate("created_at"));
		users.setNote(rs.getString("note"));
		
		return users;
	}

}

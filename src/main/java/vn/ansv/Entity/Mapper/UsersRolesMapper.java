package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.UsersRoles;

public class UsersRolesMapper implements RowMapper<UsersRoles> {

	public UsersRoles mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsersRoles usersRoles = new UsersRoles();
		
		usersRoles.setId(rs.getInt("id"));
		usersRoles.setUser(rs.getInt("user"));
		usersRoles.setRole(rs.getInt("role"));
		
		return usersRoles;
	}

}

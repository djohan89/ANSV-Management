package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.Role;

public class RoleMapper implements RowMapper<Role> {

	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
		Role role = new Role();
		
		role.setId(rs.getInt("id"));
		role.setName(rs.getString("name"));
		
		return role;
	}

}

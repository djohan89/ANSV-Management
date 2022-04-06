package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.Priority;

public class PriorityMapper implements RowMapper<Priority> {

	public Priority mapRow(ResultSet rs, int rowNum) throws SQLException {
		Priority priority = new Priority();
		
		priority.setId(rs.getInt("id"));
		priority.setPriority(rs.getInt("priority"));
		priority.setDisplay(rs.getString("display"));
		
		return priority;
	}

}

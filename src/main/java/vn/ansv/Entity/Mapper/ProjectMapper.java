package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.Project;

public class ProjectMapper implements RowMapper<Project> {

	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		Project project = new Project();
		
		project.setId(rs.getInt("id"));
		project.setCreated_by(rs.getInt("created_by"));
		project.setCustomer_id(rs.getInt("customer_id"));
		project.setProject_name(rs.getString("project_name"));
		project.setDescription(rs.getString("description"));
		project.setEnabled(rs.getInt("enabled"));
		project.setNote(rs.getString("note"));
		project.setCreated_at(rs.getDate("created_at"));
		
		return project;
	}

}

package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.ProjectStatus;

public class ProjectStatusMapper implements RowMapper<ProjectStatus> {

	public ProjectStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjectStatus projectStatus = new ProjectStatus();
		
		projectStatus.setId(rs.getInt("id"));
		projectStatus.setProject_status(rs.getString("project_status"));
		
		return projectStatus;
	}

}

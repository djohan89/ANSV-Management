package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.ProjectType;

public class ProjectTypeMapper implements RowMapper<ProjectType> {

	public ProjectType mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjectType projectType = new ProjectType();
		
		projectType.setId(rs.getInt("id"));
		projectType.setProject_type(rs.getString("project_type"));
		
		return projectType;
	}

}

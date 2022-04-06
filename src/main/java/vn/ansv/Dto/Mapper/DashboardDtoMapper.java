package vn.ansv.Dto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Dto.DashboardDto;

public class DashboardDtoMapper implements RowMapper<DashboardDto> {

	public DashboardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		DashboardDto dashboardDto = new DashboardDto();
		
		dashboardDto.setProject_id(rs.getInt("project_id"));
		dashboardDto.setProject_id(rs.getInt("detail_id"));
		dashboardDto.setProject_name(rs.getString("project_name"));
		dashboardDto.setCustomer(rs.getString("customer"));
		dashboardDto.setProject_type(rs.getInt("project_type"));
		dashboardDto.setProject_status(rs.getInt("project_status"));
		dashboardDto.setPriority(rs.getInt("priority"));
		dashboardDto.setPriority_display(rs.getString("priority_display"));
		dashboardDto.setPic_name(rs.getString("pic_name"));
		dashboardDto.setGeneral_issue(rs.getString("general_issue"));
		dashboardDto.setKe_hoach(rs.getString("ke_hoach"));
		
		return dashboardDto;
	}

}

package vn.ansv.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.ansv.Dto.DashboardDto;
import vn.ansv.Dto.ProjectDetailDto;
import vn.ansv.Dto.Mapper.DashboardDtoMapper;

@Repository
public class ProjectDao extends BaseDao {
	
	private LocalDateTime _now = LocalDateTime.now();
	
	
	
	public List<DashboardDto> getStatistic(int week, int year) {
		List<DashboardDto> list = new ArrayList<DashboardDto>();
		
		String columns_select = "project_type.project_type, priority.priority, project_status.project_status";
		
		String sql = "SELECT " + columns_select + " FROM detail "
				+ "INNER JOIN pic ON detail.pic_id = pic.id "
				+ "INNER JOIN project_type ON detail.type_id = project_type.id "
				+ "INNER JOIN priority ON detail.priority_id = priority.id "
				+ "INNER JOIN project_status ON detail.status_id = project_status.id "
				+ "WHERE detail.week = ? AND detail.year = ?";
		
		list = _jdbcTemplate.query(sql, new DashboardDtoMapper() {
			public DashboardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				DashboardDto dashboardDto = new DashboardDto();
				
				dashboardDto.setProject_type(rs.getInt("project_type"));
				dashboardDto.setProject_status(rs.getInt("project_status"));
				dashboardDto.setPriority(rs.getInt("priority"));
				
				return dashboardDto;
			}
		}, week, year);
		
		return list;
	}
	
	
	
	public List<DashboardDto> getDashboardTable(int type, int level, int week, int year) {
		List<DashboardDto> list = new ArrayList<DashboardDto>();
		
		String columns_select = "project.id AS project_id, detail.id AS detail_id, project.project_name, customer.customer, "
								+ "project_type.project_type, project_status.project_status, priority.priority, priority.display AS priority_display, "
								+ "users.display_name AS pic_name, detail.general_issue, detail.ke_hoach";
		
		String sql = "SELECT "+ columns_select +" FROM project "
					+ "INNER JOIN customer ON project.customer_id = customer.id "
					+ "INNER JOIN pic ON project.id = pic.project_id "
					+ "INNER JOIN detail ON pic.id = detail.pic_id "
					+ "INNER JOIN project_type ON detail.type_id = project_type.id "
					+ "INNER JOIN priority ON detail.priority_id = priority.id "
					+ "INNER JOIN project_status ON detail.status_id = project_status.id "
					+ "INNER JOIN users ON pic.user_id = users.id "
					+ "WHERE project_type.project_type = ? AND pic.level = ? AND detail.week = ? AND detail.year = ?";
		
		list = _jdbcTemplate.query(sql, new DashboardDtoMapper() {
			public DashboardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				DashboardDto dashboardDto = new DashboardDto();
				
				dashboardDto.setProject_id(rs.getInt("project_id"));
				dashboardDto.setDetail_id(rs.getInt("detail_id"));
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
		}, type, level, week, year);
		
		return list;
	}
	
	
	
	/* ===== Hàm truy xuất dữ liệu chi tiết dự án ===== */
	public ProjectDetailDto getProjectDetail(int type, int detail_id){
		ProjectDetailDto object = new ProjectDetailDto();
		
		String sql = "SELECT " + sql_project_detail(type)
				+ "FROM detail "
				+ "INNER JOIN pic ON detail.pic_id = pic.id "
				+ "INNER JOIN users ON pic.user_id = users.id "
				+ "INNER JOIN project ON pic.project_id = project.id "
				+ "INNER JOIN project_type ON detail.type_id = project_type.id "
				+ "INNER JOIN priority ON detail.priority_id = priority.id "
				+ "INNER JOIN project_status ON detail.status_id = project_status.id "
				+ "INNER JOIN currency_unit ON detail.currency_unit_id = currency_unit.id "
				+ "WHERE detail.id = ?";
		
		object = _jdbcTemplate.queryForObject(sql, mapper_project_detail(type), detail_id);
		return object;
	}

}

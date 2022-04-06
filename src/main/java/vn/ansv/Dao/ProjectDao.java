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
import vn.ansv.Dto.Mapper.ProjectDetailDtoMapper;

@Repository
public class ProjectDao extends BaseDao {
	
	private LocalDateTime _now = LocalDateTime.now();
	
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
	
	
	
	/* ===== Hàm truy xuất dữ liệu chi tiết dự án (Viễn thông / Chuyển đổi số) ===== */
	public ProjectDetailDto getProjectDetailLevel1(int detail_id){
		ProjectDetailDto object = new ProjectDetailDto();
		String columns_select = "users.display_name AS pic_name, project_type.display AS project_type, priority.display AS priority, "
				+ "project_status.display AS project_status, currency_unit.currency_unit, detail.week, detail.year, "
				+ "project.project_name, detail.description, detail.tong_muc_dau_tu_du_kien, detail.hinh_thuc_dau_tu, "
				+ "detail.muc_do_kha_thi, detail.phan_tich_SWOOT, detail.general_issue, detail.ke_hoach, detail.ket_qua_thuc_hien_ke_hoach ";
		String sql = "SELECT " + columns_select
				+ "FROM detail "
				+ "INNER JOIN pic ON detail.pic_id = pic.id "
				+ "INNER JOIN users ON pic.user_id = users.id "
				+ "INNER JOIN project ON pic.project_id = project.id "
				+ "INNER JOIN project_type ON detail.type_id = project_type.id "
				+ "INNER JOIN priority ON detail.priority_id = priority.id "
				+ "INNER JOIN project_status ON detail.status_id = project_status.id "
				+ "INNER JOIN currency_unit ON detail.currency_unit_id = currency_unit.id "
				+ "WHERE detail.id = ?";
		
		object = _jdbcTemplate.queryForObject(sql, new ProjectDetailDtoMapper() {
			public ProjectDetailDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProjectDetailDto projectDetailDto = new ProjectDetailDto();
				
				projectDetailDto.setPic_name(rs.getString("pic_name"));
				projectDetailDto.setProject_type(rs.getString("project_type"));
				projectDetailDto.setPriority(rs.getString("priority"));
				
				projectDetailDto.setProject_status(rs.getString("project_status"));
				projectDetailDto.setCurrency_unit(rs.getString("currency_unit"));
				projectDetailDto.setWeek(rs.getInt("week"));
				projectDetailDto.setYear(rs.getInt("year"));
				
				projectDetailDto.setProject_name(rs.getString("project_name"));
				projectDetailDto.setDescription(rs.getString("description"));
				projectDetailDto.setTong_muc_dau_tu_du_kien(rs.getString("tong_muc_dau_tu_du_kien"));
				projectDetailDto.setHinh_thuc_dau_tu(rs.getString("hinh_thuc_dau_tu"));
				
				projectDetailDto.setMuc_do_kha_thi(rs.getInt("muc_do_kha_thi"));
				projectDetailDto.setPhan_tich_SWOOT(rs.getString("phan_tich_SWOOT"));
				projectDetailDto.setGeneral_issue(rs.getString("general_issue"));
				projectDetailDto.setKe_hoach(rs.getString("ke_hoach"));
				projectDetailDto.setKet_qua_thuc_hien_ke_hoach(rs.getString("ket_qua_thuc_hien_ke_hoach"));
				
				return projectDetailDto;
			}
		}, detail_id);
		return object;
	}
	
	
	
	/* ===== Hàm truy xuất dữ liệu chi tiết dự án (Triển khai) ===== */
	public ProjectDetailDto getProjectDetailLevel2(int detail_id){
		ProjectDetailDto object = new ProjectDetailDto();
		String columns_select = "users.display_name AS pic_name, project_type.display AS project_type, priority.display AS priority, "
				+ "project_status.display AS project_status, currency_unit.currency_unit, detail.week, detail.year, "
				+ "detail.contract_code, detail.accounting_code, project.project_name, detail.description, "
				+ "detail.pham_vi_cung_cap, detail.tong_gia_tri, detail.DAC, detail.PAC, detail.FAC, detail.so_tien_tam_ung, "
				+ "detail.ke_hoach_tam_ung, detail.so_tien_DAC, detail.ke_hoach_thanh_toan_DAC, detail.so_tien_PAC, "
				+ "detail.ke_hoach_thanh_toan_PAC, detail.so_tien_FAC, detail.ke_hoach_thanh_toan_FAC, detail.general_issue, "
				+ "detail.ke_hoach, detail.ket_qua_thuc_hien_ke_hoach ";
		String sql = "SELECT " + columns_select
				+ "FROM detail "
				+ "INNER JOIN pic ON detail.pic_id = pic.id "
				+ "INNER JOIN users ON pic.user_id = users.id "
				+ "INNER JOIN project ON pic.project_id = project.id "
				+ "INNER JOIN project_type ON detail.type_id = project_type.id "
				+ "INNER JOIN priority ON detail.priority_id = priority.id "
				+ "INNER JOIN project_status ON detail.status_id = project_status.id "
				+ "INNER JOIN currency_unit ON detail.currency_unit_id = currency_unit.id "
				+ "WHERE detail.id = ?";
		
		object = _jdbcTemplate.queryForObject(sql, new ProjectDetailDtoMapper() {
			public ProjectDetailDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProjectDetailDto projectDetailDto = new ProjectDetailDto();
				
				projectDetailDto.setPic_name(rs.getString("pic_name"));
				projectDetailDto.setProject_type(rs.getString("project_type"));
				projectDetailDto.setPriority(rs.getString("priority"));
				
				projectDetailDto.setProject_status(rs.getString("project_status"));
				projectDetailDto.setCurrency_unit(rs.getString("currency_unit"));
				projectDetailDto.setWeek(rs.getInt("week"));
				projectDetailDto.setYear(rs.getInt("year"));
				
				projectDetailDto.setContract_code(rs.getString("contract_code"));
				projectDetailDto.setAccounting_code(rs.getString("accounting_code"));
				projectDetailDto.setProject_name(rs.getString("project_name"));
				projectDetailDto.setDescription(rs.getString("description"));
				
				projectDetailDto.setPham_vi_cung_cap(rs.getString("pham_vi_cung_cap"));
				projectDetailDto.setTong_gia_tri(rs.getDouble("tong_gia_tri"));
				projectDetailDto.setDAC(rs.getDate("DAC"));
				projectDetailDto.setPAC(rs.getDate("PAC"));
				projectDetailDto.setFAC(rs.getDate("FAC"));
				projectDetailDto.setSo_tien_tam_ung(rs.getDouble("so_tien_tam_ung"));
				
				projectDetailDto.setKe_hoach_tam_ung(rs.getDate("ke_hoach_tam_ung"));
				projectDetailDto.setSo_tien_DAC(rs.getDouble("so_tien_DAC"));
				projectDetailDto.setKe_hoach_thanh_toan_DAC(rs.getDate("ke_hoach_thanh_toan_DAC"));
				projectDetailDto.setSo_tien_PAC(rs.getDouble("so_tien_PAC"));
				
				projectDetailDto.setKe_hoach_thanh_toan_PAC(rs.getDate("ke_hoach_thanh_toan_PAC"));
				projectDetailDto.setSo_tien_FAC(rs.getDouble("so_tien_FAC"));
				projectDetailDto.setKe_hoach_thanh_toan_FAC(rs.getDate("ke_hoach_thanh_toan_FAC"));
				projectDetailDto.setGeneral_issue(rs.getString("general_issue"));
				
				projectDetailDto.setKe_hoach(rs.getString("ke_hoach"));
				projectDetailDto.setKet_qua_thuc_hien_ke_hoach(rs.getString("ket_qua_thuc_hien_ke_hoach"));
				
				return projectDetailDto;
			}
		}, detail_id);
		return object;
		
	}

}

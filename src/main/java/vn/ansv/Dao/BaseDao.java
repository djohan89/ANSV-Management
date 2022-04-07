package vn.ansv.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import vn.ansv.Dto.ProjectDetailDto;
import vn.ansv.Dto.Mapper.ProjectDetailDtoMapper;

public class BaseDao {
	
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public String sql_project_detail(int type){
		String columns_select = "";
		
		if (type == 1) {
			/* Cột dữ liệu cần cho chi tiết dự án Triển khai */
			columns_select = "users.display_name AS pic_name, project_type.display AS project_type, priority.display AS priority, "
					+ "project_status.display AS project_status, customer.customer, currency_unit.currency_unit, detail.week, detail.year, "
					+ "detail.contract_code, detail.accounting_code, project.project_name, detail.description, "
					+ "detail.pham_vi_cung_cap, detail.tong_gia_tri, detail.DAC, detail.PAC, detail.FAC, detail.so_tien_tam_ung, "
					+ "detail.ke_hoach_tam_ung, detail.so_tien_DAC, detail.ke_hoach_thanh_toan_DAC, detail.so_tien_PAC, "
					+ "detail.ke_hoach_thanh_toan_PAC, detail.so_tien_FAC, detail.ke_hoach_thanh_toan_FAC, detail.general_issue, "
					+ "detail.ke_hoach, detail.ket_qua_thuc_hien_ke_hoach ";
		} else if (type == 2 || type ==3) {
			/* Cột dữ liệu cần cho chi tiết dự án Viễn thông / Chuyển đổi số */
			columns_select = "users.display_name AS pic_name, project_type.display AS project_type, priority.display AS priority, "
					+ "project_status.display AS project_status, customer.customer, currency_unit.currency_unit, detail.week, detail.year, "
					+ "project.project_name, detail.description, detail.tong_muc_dau_tu_du_kien, detail.hinh_thuc_dau_tu, "
					+ "detail.muc_do_kha_thi, detail.phan_tich_SWOOT, detail.general_issue, detail.ke_hoach, detail.ket_qua_thuc_hien_ke_hoach ";
		}
		
		return columns_select;
	}
	
	public ProjectDetailDtoMapper mapper_project_detail(int type){
		ProjectDetailDtoMapper mapper = null;
		
		if (type == 1) {
			/* Mapper cho chi tiết dự án Triển khai */
			mapper = new ProjectDetailDtoMapper() {
				public ProjectDetailDto mapRow(ResultSet rs, int rowNum) throws SQLException {
					ProjectDetailDto projectDetailDto = new ProjectDetailDto();
					
					projectDetailDto.setPic_name(rs.getString("pic_name"));
					projectDetailDto.setProject_type(rs.getString("project_type"));
					projectDetailDto.setPriority(rs.getString("priority"));
					
					projectDetailDto.setProject_status(rs.getString("project_status"));
					projectDetailDto.setCustomer(rs.getString("customer"));
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
			};
		} else if (type == 2 || type ==3) {
			/* Mapper cho chi tiết dự án Viễn thông / Chuyển đổi số */
			mapper = new ProjectDetailDtoMapper() {
				public ProjectDetailDto mapRow(ResultSet rs, int rowNum) throws SQLException {
					ProjectDetailDto projectDetailDto = new ProjectDetailDto();
					
					projectDetailDto.setPic_name(rs.getString("pic_name"));
					projectDetailDto.setProject_type(rs.getString("project_type"));
					projectDetailDto.setPriority(rs.getString("priority"));
					
					projectDetailDto.setProject_status(rs.getString("project_status"));
					projectDetailDto.setCustomer(rs.getString("customer"));
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
			};
		}
		
		return mapper;
	}
		
}

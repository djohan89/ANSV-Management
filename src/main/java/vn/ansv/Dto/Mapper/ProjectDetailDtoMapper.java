package vn.ansv.Dto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Dto.ProjectDetailDto;

public class ProjectDetailDtoMapper implements RowMapper<ProjectDetailDto> {

	public ProjectDetailDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjectDetailDto projectDetailDto = new ProjectDetailDto();
		
		projectDetailDto.setDetail_id(rs.getInt("detail_id"));
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
		projectDetailDto.setTong_muc_dau_tu_du_kien(rs.getString("tong_muc_dau_tu_du_kien"));
		projectDetailDto.setHinh_thuc_dau_tu(rs.getString("hinh_thuc_dau_tu"));
		projectDetailDto.setMuc_do_kha_thi(rs.getInt("muc_do_kha_thi"));
		
		projectDetailDto.setPhan_tich_SWOOT(rs.getString("phan_tich_SWOOT"));
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
		projectDetailDto.setNote(rs.getString("note"));
		projectDetailDto.setCreated_at(rs.getDate("created_at"));
		
		return projectDetailDto;
	}

}

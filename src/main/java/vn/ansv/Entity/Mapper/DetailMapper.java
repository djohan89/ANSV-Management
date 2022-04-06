package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.Detail;

public class DetailMapper implements RowMapper<Detail> {

	public Detail mapRow(ResultSet rs, int rowNum) throws SQLException {
		Detail detail = new Detail();
		
		detail.setId(rs.getInt("id"));
		detail.setPic_id(rs.getInt("pic_id"));
		detail.setType_id(rs.getInt("type_id"));
		detail.setPriority_id(rs.getInt("priority_id"));
		detail.setStatus_id(rs.getInt("status_id"));
		
		detail.setCurrency_unit_id(rs.getInt("currency_unit_id"));
		detail.setWeek(rs.getInt("week"));
		detail.setYear(rs.getInt("year"));
		detail.setContract_code(rs.getString("contract_code"));
		detail.setAccounting_code(rs.getString("accounting_code"));
		
		detail.setJob_name(rs.getString("job_name"));
		detail.setDescription(rs.getString("description"));
		detail.setTong_muc_dau_tu_du_kien(rs.getString("tong_muc_dau_tu_du_kien"));
		detail.setHinh_thuc_dau_tu(rs.getString("hinh_thuc_dau_tu"));
		detail.setMuc_do_kha_thi(rs.getInt("muc_do_kha_thi"));
		
		detail.setPhan_tich_SWOOT(rs.getString("phan_tich_SWOOT"));
		detail.setPham_vi_cung_cap(rs.getString("pham_vi_cung_cap"));
		detail.setTong_gia_tri(rs.getDouble("tong_gia_tri"));
		detail.setDAC(rs.getDate("DAC"));
		detail.setPAC(rs.getDate("PAC"));
		
		detail.setFAC(rs.getDate("FAC"));
		detail.setSo_tien_tam_ung(rs.getDouble("so_tien_tam_ung"));
		detail.setKe_hoach_tam_ung(rs.getDate("ke_hoach_tam_ung"));
		detail.setSo_tien_DAC(rs.getDouble("so_tien_DAC"));
		detail.setKe_hoach_thanh_toan_DAC(rs.getDate("ke_hoach_thanh_toan_DAC"));
		
		detail.setSo_tien_PAC(rs.getDouble("so_tien_PAC"));
		detail.setKe_hoach_thanh_toan_PAC(rs.getDate("ke_hoach_thanh_toan_PAC"));
		detail.setSo_tien_FAC(rs.getDouble("so_tien_FAC"));
		detail.setKe_hoach_thanh_toan_FAC(rs.getDate("ke_hoach_thanh_toan_FAC"));
		detail.setGeneral_issue(rs.getString("general_issue"));
		
		detail.setKe_hoach(rs.getString("ke_hoach"));
		detail.setKet_qua_thuc_hien_ke_hoach(rs.getString("ket_qua_thuc_hien_ke_hoach"));
		detail.setNote(rs.getString("note"));
		detail.setCreated_at(rs.getDate("created_at"));
		
		return detail;
	}

}

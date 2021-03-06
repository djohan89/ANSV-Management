package vn.ansv.Dto;

import java.sql.Date;

public class ProjectDetailDto {
	
	private int detail_id;
	private String pic_name;
	private String project_type;
	private String priority;
	private String project_status;
	
	private String customer;
	private String currency_unit;
	private int week;
	private int year;
	private String contract_code;
	
	private String accounting_code;
	private String project_name;
	private String description;
	private String tong_muc_dau_tu_du_kien;
	private String hinh_thuc_dau_tu;
	
	private int muc_do_kha_thi;
	private String phan_tich_SWOOT;
	private String pham_vi_cung_cap;
	private double tong_gia_tri;
	private Date DAC;
	
	private Date PAC;
	private Date FAC;
	private double so_tien_tam_ung;
	private Date ke_hoach_tam_ung;
	private double so_tien_DAC;
	
	private Date ke_hoach_thanh_toan_DAC;
	private double so_tien_PAC;
	private Date ke_hoach_thanh_toan_PAC;
	private double so_tien_FAC;
	private Date ke_hoach_thanh_toan_FAC;
	
	private String general_issue;
	private String ke_hoach;
	private String ket_qua_thuc_hien_ke_hoach;
	private String note;
	private Date created_at;
	
	public ProjectDetailDto() {
		super();
	}


	
	public int getDetail_id() {
		return detail_id;
	}

	public void setDetail_id(int detail_id) {
		this.detail_id = detail_id;
	}

	public String getPic_name() {
		return pic_name;
	}

	public void setPic_name(String pic_name) {
		this.pic_name = pic_name;
	}

	public String getProject_type() {
		return project_type;
	}

	public void setProject_type(String project_type) {
		this.project_type = project_type;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProject_status() {
		return project_status;
	}

	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}
	
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCurrency_unit() {
		return currency_unit;
	}

	public void setCurrency_unit(String currency_unit) {
		this.currency_unit = currency_unit;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getContract_code() {
		return contract_code;
	}

	public void setContract_code(String contract_code) {
		this.contract_code = contract_code;
	}

	public String getAccounting_code() {
		return accounting_code;
	}

	public void setAccounting_code(String accounting_code) {
		this.accounting_code = accounting_code;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTong_muc_dau_tu_du_kien() {
		return tong_muc_dau_tu_du_kien;
	}

	public void setTong_muc_dau_tu_du_kien(String tong_muc_dau_tu_du_kien) {
		this.tong_muc_dau_tu_du_kien = tong_muc_dau_tu_du_kien;
	}

	public String getHinh_thuc_dau_tu() {
		return hinh_thuc_dau_tu;
	}

	public void setHinh_thuc_dau_tu(String hinh_thuc_dau_tu) {
		this.hinh_thuc_dau_tu = hinh_thuc_dau_tu;
	}

	public int getMuc_do_kha_thi() {
		return muc_do_kha_thi;
	}

	public void setMuc_do_kha_thi(int muc_do_kha_thi) {
		this.muc_do_kha_thi = muc_do_kha_thi;
	}

	public String getPhan_tich_SWOOT() {
		return phan_tich_SWOOT;
	}

	public void setPhan_tich_SWOOT(String phan_tich_SWOOT) {
		this.phan_tich_SWOOT = phan_tich_SWOOT;
	}

	public String getPham_vi_cung_cap() {
		return pham_vi_cung_cap;
	}

	public void setPham_vi_cung_cap(String pham_vi_cung_cap) {
		this.pham_vi_cung_cap = pham_vi_cung_cap;
	}

	public double getTong_gia_tri() {
		return tong_gia_tri;
	}

	public void setTong_gia_tri(double tong_gia_tri) {
		this.tong_gia_tri = tong_gia_tri;
	}

	public Date getDAC() {
		return DAC;
	}

	public void setDAC(Date dAC) {
		DAC = dAC;
	}

	public Date getPAC() {
		return PAC;
	}

	public void setPAC(Date pAC) {
		PAC = pAC;
	}

	public Date getFAC() {
		return FAC;
	}

	public void setFAC(Date fAC) {
		FAC = fAC;
	}

	public double getSo_tien_tam_ung() {
		return so_tien_tam_ung;
	}

	public void setSo_tien_tam_ung(double so_tien_tam_ung) {
		this.so_tien_tam_ung = so_tien_tam_ung;
	}

	public Date getKe_hoach_tam_ung() {
		return ke_hoach_tam_ung;
	}

	public void setKe_hoach_tam_ung(Date ke_hoach_tam_ung) {
		this.ke_hoach_tam_ung = ke_hoach_tam_ung;
	}

	public double getSo_tien_DAC() {
		return so_tien_DAC;
	}

	public void setSo_tien_DAC(double so_tien_DAC) {
		this.so_tien_DAC = so_tien_DAC;
	}

	public Date getKe_hoach_thanh_toan_DAC() {
		return ke_hoach_thanh_toan_DAC;
	}

	public void setKe_hoach_thanh_toan_DAC(Date ke_hoach_thanh_toan_DAC) {
		this.ke_hoach_thanh_toan_DAC = ke_hoach_thanh_toan_DAC;
	}

	public double getSo_tien_PAC() {
		return so_tien_PAC;
	}

	public void setSo_tien_PAC(double so_tien_PAC) {
		this.so_tien_PAC = so_tien_PAC;
	}

	public Date getKe_hoach_thanh_toan_PAC() {
		return ke_hoach_thanh_toan_PAC;
	}

	public void setKe_hoach_thanh_toan_PAC(Date ke_hoach_thanh_toan_PAC) {
		this.ke_hoach_thanh_toan_PAC = ke_hoach_thanh_toan_PAC;
	}

	public double getSo_tien_FAC() {
		return so_tien_FAC;
	}

	public void setSo_tien_FAC(double so_tien_FAC) {
		this.so_tien_FAC = so_tien_FAC;
	}

	public Date getKe_hoach_thanh_toan_FAC() {
		return ke_hoach_thanh_toan_FAC;
	}

	public void setKe_hoach_thanh_toan_FAC(Date ke_hoach_thanh_toan_FAC) {
		this.ke_hoach_thanh_toan_FAC = ke_hoach_thanh_toan_FAC;
	}

	public String getGeneral_issue() {
		return general_issue;
	}

	public void setGeneral_issue(String general_issue) {
		this.general_issue = general_issue;
	}

	public String getKe_hoach() {
		return ke_hoach;
	}

	public void setKe_hoach(String ke_hoach) {
		this.ke_hoach = ke_hoach;
	}

	public String getKet_qua_thuc_hien_ke_hoach() {
		return ket_qua_thuc_hien_ke_hoach;
	}

	public void setKet_qua_thuc_hien_ke_hoach(String ket_qua_thuc_hien_ke_hoach) {
		this.ket_qua_thuc_hien_ke_hoach = ket_qua_thuc_hien_ke_hoach;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

}

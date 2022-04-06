package vn.ansv.Dto;

public class DashboardDto {

	private int project_id;
	private int detail_id;
	private String project_name;
	private String customer;
	private int project_type;
	private int project_status;
	private int priority;
	private String priority_display;
	private String pic_name;
	private String general_issue;
	private String ke_hoach;
	
	public DashboardDto() {
		super();
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	
	public int getDetail_id() {
		return detail_id;
	}

	public void setDetail_id(int detail_id) {
		this.detail_id = detail_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getProject_type() {
		return project_type;
	}

	public void setProject_type(int project_type) {
		this.project_type = project_type;
	}

	public int getProject_status() {
		return project_status;
	}

	public void setProject_status(int project_status) {
		this.project_status = project_status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getPriority_display() {
		return priority_display;
	}

	public void setPriority_display(String priority_display) {
		this.priority_display = priority_display;
	}

	public String getPic_name() {
		return pic_name;
	}

	public void setPic_name(String pic_name) {
		this.pic_name = pic_name;
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
	
}

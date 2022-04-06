package vn.ansv.Service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ansv.Dao.ProjectDao;
import vn.ansv.Dto.DashboardDto;
import vn.ansv.Dto.ProjectDetailDto;
import vn.ansv.Service.Interface.ICeoService;

@Service
public class CeoServiceImpl implements ICeoService {
	
	@Autowired
	private ProjectDao projectDao;

	public JSONArray getDashboardTable(int type, int level, int week, int year) {
		JSONArray array = new JSONArray();
		
		List<DashboardDto> list = new ArrayList<DashboardDto>();
		list = projectDao.getDashboardTable(type, level, week, year);
		
		for (int i = 0; i < list.size(); i++) {
			JSONObject jsonObject = new JSONObject();
			
	    	jsonObject.put("project_id", list.get(i).getProject_id());
	    	jsonObject.put("detail_id", list.get(i).getDetail_id());
	    	jsonObject.put("project_name", list.get(i).getProject_name());
	    	jsonObject.put("customer", list.get(i).getCustomer());
	    	jsonObject.put("project_type", list.get(i).getProject_type());
	    	jsonObject.put("project_status", list.get(i).getProject_status());
	    	jsonObject.put("priority", list.get(i).getPriority());
	    	jsonObject.put("priority_display", list.get(i).getPriority_display());
	    	jsonObject.put("pic_name", list.get(i).getPic_name());
	    	jsonObject.put("general_issue", list.get(i).getGeneral_issue());
	    	jsonObject.put("ke_hoach", list.get(i).getKe_hoach());
	    	
	    	array.add(jsonObject);
	    }

	    return array;
	}

	
	
	/* ===== Hàm xuất dữ liệu thống kê (Dashboard - CEO) ===== */
	public List<String> getStatistic(int week, int year) {
		
		List<DashboardDto> list = new ArrayList<DashboardDto>();
		list = projectDao.getStatistic(week, year);
		
		int size = list.size();
		int count_status = 0, position = 0;
		// Tạo ra mảng(phụ) chứa dữ liệu thống kê cho phần menu
		List<Integer> thong_ke = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			thong_ke.add(i, count_status);
		}
		
		// Tạo ra mảng(chính) chứa dữ liệu thống kê cho phần menu
		List<String> statistic = new ArrayList<String>();
		for (int i = 0; i < 30; i++) {
			statistic.add(i, "");
		}
		
		for (int i = 0; i < size; i++) {
			// Thống kê số lượng dự án cho phần menu (loại dự án "triển khai")
			if (list.get(i).getProject_type() == 1) {
				statisticalSupport(list, thong_ke, i, position);
			}
			if (list.get(i).getProject_type() == 2) {
				position = 10;
				statisticalSupport(list, thong_ke, i, position);
			}
			if (list.get(i).getProject_type() == 3) {
				position = 20;
				statisticalSupport(list, thong_ke, i, position);
			}
		}
		System.out.println("Thống kê: " + thong_ke);
		
		for (int i = 0; i < 30; i++) {
			if (thong_ke.get(i) == 0) {
				statistic.set(i, "null");
			} else {
				statistic.set(i, Integer.toString(thong_ke.get(i)));
			}
		}
		
		return statistic;
	}
	
	/* ===== Hàm (hỗ trợ) xuất dữ liệu thống kê (Dashboard - CEO) ===== */
	public List<Integer> statisticalSupport(List<DashboardDto> list, List<Integer> thong_ke, int i, int position) {
		
		// Thống kê ưu tiên thứ tư (Đã hoàn thành)
		if (list.get(i).getProject_status() == 1) {
			thong_ke.set(position + 9, thong_ke.get(position + 9)+1);
		}
		
		// Thống kê ưu tiên thứ nhất
		if (list.get(i).getPriority() == 1) {
			if (list.get(i).getProject_status() == 4) {
				/* System.out.println(i + ", " + "First - Danger"); */
				thong_ke.set(position, thong_ke.get(position) + 1);
			}
			if (list.get(i).getProject_status() == 3) {
				/* System.out.println(i + ", " + "First - Warning"); */
				thong_ke.set(position + 1, thong_ke.get(position + 1) + 1);
			}
			if (list.get(i).getProject_status() == 2) {
				/* System.out.println(i + ", " + "First - Ongoing"); */
				thong_ke.set(position + 2, thong_ke.get(position + 2) + 1);
			}
		}
		
		// Thống kê ưu tiên thứ hai
		if (list.get(i).getPriority() == 2) {
			if (list.get(i).getProject_status() == 4) {
				/* System.out.println(i + ", " + "Seccond - Danger"); */
				thong_ke.set(position + 3, thong_ke.get(position + 3)+1);
			}
			if (list.get(i).getProject_status() == 3) {
				/* System.out.println(i + ", " + "Seccond - Warning"); */
				thong_ke.set(position + 4, thong_ke.get(position + 4)+1);
			}
			if (list.get(i).getProject_status() == 2) {
				/* System.out.println(i + ", " + "Seccond - Ongoing"); */
				thong_ke.set(position + 5, thong_ke.get(position + 5)+1);
			}
		}
		
		// Thống kê ưu tiên thứ ba
		if (list.get(i).getPriority() == 3) {
			if (list.get(i).getProject_status() == 4) {
				/* System.out.println(i + ", " + "Third - Danger"); */
				thong_ke.set(position + 6, thong_ke.get(position + 6)+1);
			}
			if (list.get(i).getProject_status() == 3) {
				/* System.out.println(i + ", " + "Third - Warning"); */
				thong_ke.set(position + 7, thong_ke.get(position + 7)+1);
			}
			if (list.get(i).getProject_status() == 2) {
				/* System.out.println(i + ", " + "Third - Ongoing"); */
				thong_ke.set(position + 8, thong_ke.get(position + 8)+1);
			}
		}
		
		return thong_ke;
	}
	
	public ProjectDetailDto getProjectDetailLevel1(int detail_id) {
		return projectDao.getProjectDetailLevel1(detail_id);
	}

	public ProjectDetailDto getProjectDetailLevel2(int detail_id) {
		return projectDao.getProjectDetailLevel2(detail_id);
	}

}

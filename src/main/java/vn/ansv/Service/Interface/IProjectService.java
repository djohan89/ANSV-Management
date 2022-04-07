package vn.ansv.Service.Interface;

import java.util.List;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ansv.Dto.ProjectDetailDto;

@Service
public interface IProjectService {

	@Autowired
	public List<String> getStatistic(int week, int year);
	public JSONArray getDashboardTable(int type, int level, int week, int year);
	public ProjectDetailDto getProjectDetail(int type, int detail_id);
	
}

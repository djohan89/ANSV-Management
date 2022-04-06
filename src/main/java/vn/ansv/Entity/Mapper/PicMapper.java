package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.Pic;

public class PicMapper implements RowMapper<Pic> {

	public Pic mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pic pic = new Pic();
		
		pic.setId(rs.getInt("id"));
		pic.setProject_id(rs.getInt("project_id"));
		pic.setUser_id(rs.getInt("user_id"));
		pic.setLevel(rs.getInt("level"));
		pic.setProgress(rs.getInt("progress"));
		pic.setEnabled(rs.getInt("enabled"));
		pic.setNote(rs.getString("note"));
		pic.setCreated_at(rs.getDate("created_at"));
		pic.setAssigned_by(rs.getInt("assigned_by"));
		
		return pic;
	}

}

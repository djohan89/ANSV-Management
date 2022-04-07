package vn.ansv.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.ansv.Dto.CustomerDto;
import vn.ansv.Dto.Mapper.CustomerDtoMapper;

@Repository
public class CustomerDao extends BaseDao {
	
	private LocalDateTime _now = LocalDateTime.now();
	
	public List<CustomerDto> getAll(){
		String sql ="SELECT customer.id, customer.customer, customer.created_at, users.display_name AS created_by "
				+ "FROM customer INNER JOIN users ON customer.created_by = users.id";
		return _jdbcTemplate.query(sql, new CustomerDtoMapper() {
			public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				CustomerDto customerDto = new CustomerDto();
				
				customerDto.setId(rs.getInt("id"));
				customerDto.setCustomer(rs.getString("customer"));
				customerDto.setCreated_at(rs.getDate("created_at"));
				customerDto.setCreated_by(rs.getString("created_by"));
				
				return customerDto;
			}
		});
	}
	
	public List<CustomerDto> getNews(){
		String sql ="SELECT customer.id, customer.customer, customer.created_at "
				+ "FROM customer INNER JOIN users ON customer.created_by = users.id ORDER BY customer.created_at LIMIT 5";
		return _jdbcTemplate.query(sql, new CustomerDtoMapper() {
			public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				CustomerDto customerDto = new CustomerDto();
				
				customerDto.setId(rs.getInt("id"));
				customerDto.setCustomer(rs.getString("customer"));
				customerDto.setCreated_at(rs.getDate("created_at"));
				
				return customerDto;
			}
		});
	}
	
}

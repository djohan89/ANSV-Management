package vn.ansv.Dto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Dto.CustomerDto;

public class CustomerDtoMapper implements RowMapper<CustomerDto> {

	public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerDto customerDto = new CustomerDto();
		
		customerDto.setId(rs.getInt("id"));
		customerDto.setCustomer(rs.getString("customer"));
		customerDto.setCreated_at(rs.getDate("created_at"));
		customerDto.setCreated_by(rs.getString("created_by"));
		
		return customerDto;
	}

}

package vn.ansv.Entity.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.ansv.Entity.CurrencyUnit;

public class CurrencyUnitMapper implements RowMapper<CurrencyUnit> {

	public CurrencyUnit mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurrencyUnit currencyUnit = new CurrencyUnit();
		
		currencyUnit.setId(rs.getInt("id"));
		currencyUnit.setCurrency_unit(rs.getString("currency_unit"));
		
		return currencyUnit;
	}

}

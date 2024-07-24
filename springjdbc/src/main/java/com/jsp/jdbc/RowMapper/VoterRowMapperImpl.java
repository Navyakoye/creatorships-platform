package com.jsp.jdbc.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.jdbc.entity.voters;


@Component
public class VoterRowMapperImpl implements RowMapper<voters>{

	public voters mapRow(ResultSet rs, int rowNum) throws SQLException {
		voters vt=new voters();
		vt.setVoter_Id(rs.getInt(1));
		vt.setVoter_Name(rs.getString(2));
		vt.setVoter_age(rs.getInt(3));
		vt.setVoter_address(rs.getString(4));
		vt.setVoter_gender(rs.getString(5));
		vt.setVoter_Mobile(rs.getString(6));
		return vt;
	}

}

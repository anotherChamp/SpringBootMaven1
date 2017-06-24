package com.anuja.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.anuja.entity.UserPojo;

@Component
public class SignUpDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean registerUser(UserPojo userPojo)
	{
		String sql = "insert into users (username,password,name,email) values ("+userPojo.getUsername()+","+userPojo.getPassword()+","+userPojo.getName()+","+userPojo.getEmail()+")";
		
		if(jdbcTemplate.update(sql)>0)
		{
			return true;
		}
		return false;
	}

}

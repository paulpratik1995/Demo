package com.gps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gps.dao.LoginDao;
import com.gps.dto.LoginDto;

@Service
public class loginservice {
	
	@Autowired
	private LoginDao dao;
	
	public LoginDto login(LoginDto dto) {
		return dao.login(dto);
	}
	
	public static LoginDao save(LoginDao parms) {
		return null;
	}

}
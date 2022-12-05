package com.gps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gps.dao.LoginDao;
import com.gps.dto.LoginDto;
import com.gps.service.loginservice;

@RestController
@RequestMapping("/login")
public class logincontroller {
	
	@Autowired
	private loginservice service;
	@Autowired
	private LoginDao loginDao;
	
	@PostMapping("/user")
	public LoginDto savelogin(@RequestBody LoginDto login) {
		return service.login(login);
	}

}
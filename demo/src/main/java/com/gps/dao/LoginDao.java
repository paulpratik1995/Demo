package com.gps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gps.dto.LoginDto;
import com.gps.model.LoginEntity;
import com.gps.repository.LoginRepository;

@Component
public class LoginDao {
	
	@Autowired
	private LoginRepository repository;
	
	public LoginDto login(LoginDto login) {
		
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setEmail(login.getEmail());
		loginEntity.setPassword(login.getPassword());
		
		LoginEntity entity = repository.save(loginEntity);
		if (entity != null) {
			return login;
		}
		return null;
	}

}




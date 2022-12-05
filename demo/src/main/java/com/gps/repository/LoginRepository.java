package com.gps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gps.model.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, String> {

}

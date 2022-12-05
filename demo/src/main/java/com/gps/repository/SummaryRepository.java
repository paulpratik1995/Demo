package com.gps.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gps.model.SummaryEntity;

@Repository
public interface SummaryRepository extends JpaRepository<SummaryEntity, String> {

	public Optional<SummaryEntity> getEntityByDeviceId(String deviceId);
}

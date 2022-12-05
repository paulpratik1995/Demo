package com.gps.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gps.dto.SummaryDto;
import com.gps.model.SummaryEntity;
import com.gps.repository.SummaryRepository;

@Component
public class SummaryDao {

	@Autowired
	private SummaryRepository repository;

	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date date = new Date();
		String getDate = (formatter.format(date));
		return getDate;
	}

	public SummaryDto summary(SummaryDto summary) {

		SummaryEntity summaryEntity = new SummaryEntity();
		summaryEntity.setDeviceId(summary.getDeviceId());
		summaryEntity.setDevicetype(summary.getDevicetype());
		summaryEntity.setTimestamp(summary.getTimestamp());
		summaryEntity.setLocation(summary.getLocation());
		System.out.println(summary.getTimestamp());
		SummaryEntity entity = repository.save(summaryEntity);
		if (entity != null) {
			return summary;
		}
		return null;
	}

	public Optional<SummaryEntity> findBydeviceId(String deviceId) {
		// TODO Auto-generated method stub
		return repository.getEntityByDeviceId(deviceId);
	}

}
package com.gps.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gps.dao.SummaryDao;
import com.gps.dto.SummaryDto;
import com.gps.model.SummaryEntity;

@Service
public class SummaryService {

	@Autowired
	private SummaryDao summaryDao;

	public SummaryDto summary(SummaryDto dto) {
		return summaryDao.summary(dto);
	}

	public Optional<SummaryEntity> getSummarydetailsBydeviceId(String deviceId) {
		return summaryDao.findBydeviceId(deviceId);
	}

	public static SummaryDao save(SummaryDao parms) {
		return null;
	}

}
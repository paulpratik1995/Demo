package com.gps.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gps.dao.SummaryDao;
import com.gps.dto.SummaryDto;
import com.gps.model.SummaryEntity;
import com.gps.service.SummaryService;

@RestController
@RequestMapping("/get")
public class SummaryController {

	@Autowired
	private SummaryService summaryService;
	@Autowired
	private SummaryDao summaryDao;

	@PostMapping("/register")
	public SummaryDto saveSummary(@RequestBody SummaryDto summary) {
		return summaryService.summary(summary);
	}

	@GetMapping("/fetch/id/{deviceId}")
	public Optional<SummaryEntity> getSumamrydetailsBydeviceId(@PathVariable("deviceId") String deviceId) {
		return summaryService.getSummarydetailsBydeviceId(deviceId);
	}

}
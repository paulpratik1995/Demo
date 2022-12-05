package com.gps.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class SummaryDto {

	private String deviceId;
	private String devicetype;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm")
	private LocalDateTime timestamp;
	private String location;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public SummaryDto(String deviceId, String devicetype, String location) {
		this();
		this.deviceId = deviceId;
		this.devicetype = devicetype;
		this.location = location;
	}

	public SummaryDto() {
		this.timestamp = LocalDateTime.now();
	}

	public SummaryDto(String deviceId, String devicetype, LocalDateTime timestamp, String location) {
		this.deviceId = deviceId;
		this.devicetype = devicetype;
		this.timestamp = timestamp;
		this.location = location;
	}

}

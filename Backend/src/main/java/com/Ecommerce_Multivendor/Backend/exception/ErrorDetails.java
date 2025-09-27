package com.Ecommerce_Multivendor.Backend.exception;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorDetails {
	
	private String error;
	private String details;
	private LocalDateTime timestamp;

	public ErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public ErrorDetails(String error, String details, LocalDateTime timestamp) {
		super();
		this.error = error;
		this.details = details;
		this.timestamp = timestamp;
	}

    public void setError(String error) {
		this.error = error;
	}

    public void setDetails(String details) {
		this.details = details;
	}

    public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}

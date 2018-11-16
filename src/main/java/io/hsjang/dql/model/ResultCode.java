package io.hsjang.dql.model;

import org.springframework.http.HttpStatus;

public enum ResultCode {

	OK(HttpStatus.OK, false, ""),
	DQL(HttpStatus.BAD_REQUEST, true, "invalid DQL");
	
	HttpStatus status;
	boolean custom;
	String message;
	ResultCode(HttpStatus status,boolean custom, String message) {
		this.status = status;
		this.custom = custom;
		this.message = message;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public int getCode() {
		return status.value();
	}
	
	public String getMessage() {
		return custom? this.message : status.getReasonPhrase();
	}
}

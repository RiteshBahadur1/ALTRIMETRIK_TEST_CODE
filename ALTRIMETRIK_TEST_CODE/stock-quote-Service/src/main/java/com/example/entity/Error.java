package com.example.entity;

public class Error {

	private int errorCode;
	private String message ;
	public Error() {}
	public Error(int errorCode, String message) {
		this.errorCode = errorCode;
		this.message = message;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Error [errorCode=" + errorCode + ", message=" + message + "]";
	}
	
}

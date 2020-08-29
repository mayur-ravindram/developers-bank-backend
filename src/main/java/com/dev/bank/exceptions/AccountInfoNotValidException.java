package com.dev.bank.exceptions;

public class AccountInfoNotValidException extends Exception {

	private String errorCode;
	private String errorDesc;
	
	public AccountInfoNotValidException() {
		super();
	}
	
	public AccountInfoNotValidException(String errorMsg, String errorDesc) {
		
		this.errorCode = errorMsg;
		this.errorDesc = errorDesc;
		
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	
	
}

package com.dev.bank.exceptions;

public class UserNotValidException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorMsg;
	private String errorDesc;

	public UserNotValidException() {
		super();
	}

	public UserNotValidException(String errorMessage, String errorDescription) {
		this.errorMsg = errorMessage;
		this.errorDesc = errorDescription;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
}

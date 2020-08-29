package com.dev.bank.models;

/**
 * @author MayurRavindram
 *
 */
public class User {

	private String userId;
	private String userName;
	private String secret;
	
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	
}

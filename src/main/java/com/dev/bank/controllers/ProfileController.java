package com.dev.bank.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.bank.exceptions.UserNotValidException;
import com.dev.bank.models.ProfileInfo;
import com.dev.bank.models.User;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	Logger log = LoggerFactory.getLogger(getClass());
	
	@PostMapping("/login")
	public ProfileInfo getProfile(User user) {
		log.info("User Login Info captured:", user);
		// authenticate user
		if(!isValidUserInfo(user)) {
			throw new UserNotValidException("Error", "User Info is not Valid!");
		}
		ProfileInfo pi = new ProfileInfo();
		pi.setProfileName("Dev-001");
		pi.setProfilePic("/assest/profiles/dev-001");
		return pi;
	}

	private boolean isValidUserInfo(User user) {
		return null != user.getUserName() && null != user.getSecret();
	}
}

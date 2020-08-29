package com.dev.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.bank.exceptions.AccountInfoNotValidException;
import com.dev.bank.models.AccountInfo;
import com.dev.bank.models.Balance;
import com.dev.bank.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@PostMapping("/balance") 
	public Balance getBalance(@RequestBody AccountInfo accountInfo) throws AccountInfoNotValidException {
		if(!validAccountInfo(accountInfo)) {
			throw new AccountInfoNotValidException("Error", "AccountInfo is not Valid");
		}
		return service.getBalance(accountInfo);
	}

	private boolean validAccountInfo(AccountInfo accountInfo) {
		return 0 != accountInfo.getAccountId() && null != accountInfo.getAccountName();
	}
}

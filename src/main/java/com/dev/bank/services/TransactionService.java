package com.dev.bank.services;

import org.springframework.stereotype.Service;

import com.dev.bank.models.AccountInfo;
import com.dev.bank.models.Balance;
import com.dev.bank.utilities.BalanceUtility;

@Service
public class TransactionService {

	/**
	 * this service exposes operations to carry out various transfers
	 * this can be pulling latest balance or initiate transfer
	 */
	
	public Balance getBalance(AccountInfo accountDetails) {
		
		return BalanceUtility.getbalanceForAccount(accountDetails);
	}
}

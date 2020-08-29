package com.dev.bank.utilities;

import com.dev.bank.models.AccountInfo;
import com.dev.bank.models.Balance;

public class BalanceUtility {

	public static Balance getbalanceForAccount(AccountInfo accountInfo) {
		Balance balance = new Balance();
		balance.setCurrentBalance(100.0);
		return balance;
	}
}

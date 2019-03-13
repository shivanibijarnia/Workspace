package com.cg.wallet.service;

import java.math.BigDecimal;

import com.cg.wallet.beans.Customer;

public class WalletServiceImpl implements WalletService{

	@Override
	public Customer createAccount(Customer customer) {
		
		return null;
	}

	@Override
	public Customer showBalance(String mobileno) {
		
		return null;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) {
		
		return null;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		
		return null;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		
		return null;
	}

}

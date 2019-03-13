package com.cg.wallet.service;

import java.math.BigDecimal;
import com.cg.wallet.beans.Customer;


public interface WalletService {

	public Customer createAccount(Customer customer);
	public Customer showBalance (String mobileno);
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
	public Customer depositAmount (String mobileNo,BigDecimal amount );
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);
}

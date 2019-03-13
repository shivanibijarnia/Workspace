package com.cg.wallet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.wallet.beans.Customer;

@Controller
public class URIController {
	
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "IndexPage";
	}
	
	@RequestMapping(value="/login")
	public String getLoginPage() {
		return "LoginPage";
	}
	
	@RequestMapping(value="/registration")
	public String getRegistrationPage() {
		return "Registration";
	}
	
	@RequestMapping(value="/viewBalance")
	public String getViewBalancePage() {
		return "ShowBalance";
	}

	@RequestMapping(value="/deposit")
	public String getDepositPage() {
		return "Depositpage";
	}
	
	@RequestMapping(value="/withdraw")
	public String getWithdrawPage() {
		return "WithdrawPage";
	}
	
	@RequestMapping(value="/fundTransfer")
	public String getFundTransferPage() {
		return "FundTransferPage";
	}
	
	@ModelAttribute("customer")
	public Customer getCustomer() {
		return new Customer();
		
	}
	
	
	
	
}

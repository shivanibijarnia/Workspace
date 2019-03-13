package com.cg.wallet.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.wallet.beans.Customer;
import com.cg.wallet.service.WalletService;

@Controller
public class CustomerActionCustomer {
	
	@Autowired
	WalletService service;
	
	@RequestMapping(value="/registerCustomer")
	public ModelAndView registerCustomer(@Valid@ModelAttribute("customer")Customer customer) {
		customer = service.createAccount(customer);
		return new ModelAndView("RegistrationSuccessPage","customer",customer);
	}
}

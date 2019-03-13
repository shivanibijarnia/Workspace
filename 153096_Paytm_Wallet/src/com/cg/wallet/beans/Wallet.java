package com.cg.wallet.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	@Column(name = "wallet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	BigDecimal balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Wallet() {
	}

	public Wallet(int id, BigDecimal balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

}

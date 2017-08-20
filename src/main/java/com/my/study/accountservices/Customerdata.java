package com.my.study.accountservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customerdata {

	@Id
	@GeneratedValue
	private Long accountNumber;
	
	
	private String accountName;
	
	
	private Long balance;

	public Customerdata() {
	};

	public Customerdata(String accountName, Long balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;

	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	
	public Long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public Long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Accountdetail [accountNumber=" + accountNumber + ", accountName=" + accountName + ", Balance=" + balance
				+ "]";
	}

}

package pl.wisniowski;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Account {

	private BigDecimal amount;
	private long accountNumber;
	
	
	
	
	public Account(BigDecimal amount, long accountNumber) {
		this.amount = amount;
		this.accountNumber = accountNumber;

	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	
}

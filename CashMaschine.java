package pl.wisniowski;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CashMaschine {

	private BigDecimal amount;

	private List<CashMaschine> cashSaldo = new ArrayList<CashMaschine>();

	/*
	 * public BigDecimal getAmount() { return amount; }
	 */

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public List<CashMaschine> getCashSaldo() {
		return cashSaldo;
	}

	public void setCashSaldo(List<CashMaschine> cashSaldo) {
		this.cashSaldo = cashSaldo;
	}

	public CashMaschine(BigDecimal amount) {

		this.amount = amount;

	}

	public BigDecimal deposit(BigDecimal amount) {

		this.amount = this.amount.add(amount);

		return this.amount;

	}

	public BigDecimal withdrawal(BigDecimal amount) throws Exception {
		this.amount = this.amount.subtract((BigDecimal) amount);

		if (amount.compareTo(this.amount) == 1) {

			throw new Exception("withdrawal is higher than cash maschine balance");

		}

		return this.amount;

	}

}

// withdrawal
// deposit

package pl.wisniowski;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Client {

	private long id;

	private String name;

	private List<Account> accounts = new ArrayList<Account>();

	public Client(long id, String name) {

		this.accounts = new ArrayList<>();
		this.id = id;
		this.name = name;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;

	}

	public BigDecimal sum() {

		BigDecimal totalMoney = new BigDecimal(0);
		for (Account account : accounts) {
			totalMoney = totalMoney.add(account.getAmount());
		}
		return totalMoney.setScale(2, RoundingMode.HALF_UP);

	}

}

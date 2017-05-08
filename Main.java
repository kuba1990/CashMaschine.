package pl.wisniowski;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {

	private static Scanner scannClient = new Scanner(System.in);

	long inpAccount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();

		System.out.println("How much you want to withdrawal");

		BigDecimal inpAmount = scannClient.nextBigDecimal();

		/* long scanner.nextType */

		
		
		
		/*clients();

		cashMaschine();*/

	}

	public static void cashMaschine() {

		CashMaschine cashMaschine = new CashMaschine(new BigDecimal(100000.00));

		ArrayList<CashMaschine> cashmaschineAmount = new ArrayList<CashMaschine>();
		cashmaschineAmount.add(cashMaschine);

		System.out.println(cashMaschine.getAmount());

		/*
		 * cashmaschine.setAmount(new BigDecimal(10000088.00));
		 * 
		 * System.out.println(cashmaschine.getAmount());
		 */

	}

	public static void clients() {

		/*
		 * client.setId(1);
		 * 
		 * client.setName("Pawel");
		 */

		Account account = new Account(new BigDecimal(122221.21), 1111);

		Account account1 = new Account(new BigDecimal(128891.21), 2222);

		Account account2 = new Account(new BigDecimal(122881.21), 3333);

		Account account3 = new Account(new BigDecimal(1124221.21), 4444);

		Account account4 = new Account(new BigDecimal(1), 5555);

		Account account5 = new Account(new BigDecimal(88321.21), 6666);

		System.out.println(account1.getAccountNumber());

		/*
		 * List<Account> listPawel = Arrays.asList(account, account1, account2,
		 * account3);//zmieniæ
		 */
		ArrayList<Account> listPawel = new ArrayList<Account>();

		listPawel.add(account);
		listPawel.add(account1);
		listPawel.add(account2);
		listPawel.add(account3);

		System.out.println(listPawel.size());

		ArrayList<Account> listKuba = new ArrayList<Account>();

		listKuba.add(account4);
		listKuba.add(account5);

		ArrayList<Account> accountsBank = new ArrayList<Account>();
		accountsBank.addAll(listPawel);
		accountsBank.addAll(listKuba);

		BigDecimal sumPawel = listPawel.stream().map(Account::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);

		System.out.println(sumPawel.setScale(2, RoundingMode.HALF_UP));

		BigDecimal sumKuba = listKuba.stream().map(Account::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);

		System.out.println(sumKuba.setScale(2, RoundingMode.HALF_UP));

		/// PRZYPOMNIJ!!!
		/*
		 * System.out.println(account.getAmount() + " " +
		 * account.getAccountNumber());
		 */

		Client client = new Client(1, "Pawel");

		Client client2 = new Client(2, "Kuba");

		client.getAccounts().add(account);
		client.getAccounts().add(account1);
		client.getAccounts().add(account2);
		client.getAccounts().add(account3);

		client2.getAccounts().add(account4);
		client2.getAccounts().add(account5);

		/// PRZYPOMNIJ!!!
		/* System.out.println(client.getName() + "  " + client.getId()); */

		List<Client> clients = new ArrayList<Client>();

		clients.add(client);
		clients.add(client2);

		for (Client bankCustomer : clients) {

			System.out.println("----------------------------------------------------------");
			System.out.println("Client's name" + ":" + " " + bankCustomer.getName());

			System.out.println("Clients Id =" + " " + bankCustomer.getId());

			System.out.println("Accounts");

			System.out.println("SUM:  " + bankCustomer.sum());

			for (Account accountCustomer : bankCustomer.getAccounts()) {

				System.out.println("Number" + " " + accountCustomer.getAccountNumber());
				System.out.println("Amount" + " " + accountCustomer.getAmount().setScale(2, RoundingMode.HALF_UP));

			}

		}

	}

}

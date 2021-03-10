package BankAccount;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String file="E:\\Chrome downloads\\NewBankAccounts.csv";
		List<String[]> data=Readfile.CSV.read(file);
		List<Account> acc=new LinkedList<Account>();
		for(int i=0;i<data.size();i++) {
			String s[]=data.get(i);
			if(s[2].equals("Savings")) {
				acc.add(new Savings(s[0],s[1],Integer.parseInt(s[3])));
			}
			else
				acc.add(new Checking(s[0],s[1],Integer.parseInt(s[3])));
		}
		for(Account account:acc) {
			System.out.println("************");
			account.showInfo();
		}
	}

}

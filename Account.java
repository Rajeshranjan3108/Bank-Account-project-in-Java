package BankAccount;

public abstract class Account implements BaseRate {
	private String name;
	private String sSN;
	private double balance;
	private static int ID = 10000;
	protected String AccntNumber;
	protected double rate;
	
	public Account(String name, String sSN, double initDep) {
		this.name = name;
		this.sSN = sSN;
		balance = initDep;
//		System.out.println("Name: " + name + " sSn= " + sSN + " balance= $" + balance);
		AccntNumber=getNumber();
		
	}
	
	private String getNumber() {
		ID++;
		int rand=(int)(Math.random()*1000);
		String last2digit=sSN.substring(sSN.length()-2, sSN.length());
		return (last2digit+ID+rand);
	}
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\nAccnt#= "+AccntNumber+
				"\nbalance=$"+balance+
				"\nrate="+rate+"%"
				);
	}
	public void deposit(double amount) {
		balance+=amount;
		viewBalance();
	}
	public void withdraw(double amount) {
		balance-=amount;
		viewBalance();
	}
	public void transfer(String toWhom, double amount) {
		balance-=amount;
		System.out.println("$"+amount+" Money transferred to "+toWhom);
		viewBalance();
	}
	public void viewBalance() {
		System.out.println("Balance= $"+balance);
	}
}

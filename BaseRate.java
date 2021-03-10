package BankAccount;

public interface BaseRate {
	 default double Irate() {
		 return 2.5;
	 }
}

package BankAccount;

public class Savings extends Account{
	private int SafetyBoxId;
	private int SafetyBoxKey;
public Savings(String name,String sSN,double initDep){
		super(name,sSN,initDep);
//		System.out.println("Savings Account");
		AccntNumber="2"+AccntNumber;
//		System.out.println("AccntNumber: "+AccntNumber);
//		System.out.println(" Your Savings accounts features:");
		getInterest();
//		getSafetyBoxId();
//		getSafetyBoxKey();
	}
private void getInterest() {
	rate=Irate()-.25;
//	System.out.println("Interest rate: "+rate);
}
	private void getSafetyBoxId() {
		SafetyBoxId=(int)(Math.random()*Math.pow(10, 3));
		System.out.println("SafetyBoxId is "+SafetyBoxId);
	}
	private void getSafetyBoxKey() {
		SafetyBoxKey=(int)(Math.random()*Math.pow(10, 4));
		System.out.println("SafetyBoxkey is "+SafetyBoxKey);
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Savings accounts features:");
		getSafetyBoxId();
		getSafetyBoxKey();
	}
}

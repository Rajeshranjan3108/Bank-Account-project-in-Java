package BankAccount;

public class Checking extends Account {
	private int debitCardNum;
	private int debitPin;
	public Checking(String name,String sSN,double initDep){
		super(name,sSN,initDep);
		AccntNumber="1"+AccntNumber;
//		System.out.println("AccntNumber: "+AccntNumber);
		
		getInterest();
//		getdebitCardNum();
//		getdebitPin();
	}
	private void getInterest() {
		rate=Irate()*.15;
//		System.out.println("Interest rate= "+rate);
	}
	
	private void getdebitCardNum() {
		debitCardNum=(int)(Math.random()*Math.pow(10, 12));
		System.out.println("debitCard#: "+debitCardNum);
	}
	private void getdebitPin() {
		debitPin=(int)(Math.random()*Math.pow(10, 4));
		System.out.println("debitCardPin#: "+debitPin);
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Checking accounts features:");
		getdebitCardNum();
		getdebitPin();
	}
}

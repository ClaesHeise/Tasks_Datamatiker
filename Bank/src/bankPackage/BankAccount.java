package bankPackage;

public class BankAccount {
	private String owner;
	private double balance;
	
	BankAccount(String _owner, double _balance){
		this.owner = _owner;
		this.balance = _balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setOwner(String own) {
		owner = own;
	}
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public static String getName(String msg) {
		return "";
	}
}

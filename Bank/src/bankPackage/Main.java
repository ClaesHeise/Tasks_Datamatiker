package bankPackage;
import java.util.Scanner;

public class Main {
	//public static BankAccount egon = new BankAccount("Egon", 1000);
	//public static BankAccount børge = new BankAccount("Børge", 30000);
	//public static BankAccount benny = new BankAccount("Benny", 50);
	public static BankAccount a1 = new BankAccount("", 1000);
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Write in the name and assets of the accountholder:");
		String name = userInput.nextLine();
		//double assets = userInput.nextDouble();
		while(name != null) {
			System.out.println("Name is: "+name+" Assets is: ");
			a1.setOwner(name);
			a1.setBalance(1000);
			System.out.println("The name is: "+a1.getOwner()+" balance is: "+a1.getBalance());
		if(name.isEmpty()) {
			//System.out.println("Name is: "+name);
			//System.out.println("Name of accountholder: "+a1.getOwner()+", your accountbalance is: "+a1.getBalance());
			System.out.println("You just pressed enter");
			//a1 = new BankAccount(1000);
		}
			if(userInput.hasNextLine()) {
				name = userInput.nextLine();
			}
			else {
				System.out.println("Hello");
				name = null;
			}
		}
		//System.out.println("Name of accountholder: "+egon.getOwner()+", your accountbalance is: "+egon.getBalance());
		//System.out.println("Name of accountholder: "+børge.getOwner()+", your accountbalance is: "+børge.getBalance());
		//System.out.println("Name of accountholder: "+benny.getOwner()+", your accountbalance is: "+benny.getBalance());
	}

}

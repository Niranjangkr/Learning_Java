package test1;
/* 8.	Create a class named Account with accno(long) and balance(float)  as instance variables. In the testing class , the account object is created using the following code:
Account ac1= new Account(‘A-1’);
 Where ‘A1’  is the Account number.
 Write appropriate constructor for  the above line of code in the Account class. Also provide appropriate getter/setter methods to initialize the balance.  Include a display method to display account details.
Objective: Constructors and getter/setter methods.

9.	Use  the Account class above , suppose two more  Account objects are created in the following way: 
Account ac2= new Account ();
Account ac3= new Account(‘A-3’,5000);
Include appropriate constructors to support the above object creation also include appropriate setdetails method to set the values of the remaining instance variables.
All these accounts belong to one particular branch named ‘Bank of Quepem’ . Store this details in a variable called bank_name and provide a method named ‘getBranch()  to return this name. Modify the display method to include a call to the getBranch() method. Also display the total number of accounts in the branch.
Objective : constructors, static variables and static methods.


10.	Using the Account class created above , create an array of Account objects in the main method. Provide a method called search in the Account class created in(4-5) .Also   write methods for withdrawal and deposit . Use these methods on account specified by the user to perform the deposit/withdrawal operations as long as the user desires.
Objectives: Array of objects, array of objects as method parameter, static methods

*/

import java.util.Scanner;

class Account {
	String accno;
	float balance;
	
	public int search(String check) {
		System.out.println(check);//test
		if(getAccNo() == check) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public String getAccNo(){
		return accno; 
	}
//	Methods for withdrawal and deposit
	
	public void deposit(int amt) {
		balance = balance + amt;
	}
	public void withdrawal(int amt) {
		balance = balance - amt;
	} 
	
	static int count = 0;
	static String bank_name = "Bank of Quepem";
	public String getBranch() {
		return bank_name;
	}
	
	public void setDetails(String accNo) {
		accno = accNo;
	}
	
	public Account() {
		count++;
		
	}
	
	public Account(String accNo, float bal) {
		accno = accNo;
		balance = bal;
		count++;
	}
	
	public Account(String accNo) {
		accno = accNo;
		count++;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("___________"+getBranch()+"____________\n\n");
		System.out.println("Account Number :"+accno);
		System.out.println("Balance :"+getBalance());
		System.out.println("Current total account number: "+count);
	}
}
public class Q_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1= new Account("A-1");
		ac1.setBalance(5999);
		ac1.display();
		
		Account ac2= new Account ();
		ac2.setDetails("A-2");
		ac2.setBalance(5000);
		ac2.display();
		Account ac3= new Account("A-3",5000);
		ac3.display();
		
		Account[] acc = {ac1, ac2, ac3};
		
//		Withdraw and Deposit option as long user desire for specific acc
		Scanner in = new Scanner(System.in);
		System.out.println("\n\n_____________________Withdraw/Deposit_____________________________\n\n");
		System.out.println("To do Transaction press any number(Press Zero if you dont want any transaction): ");
		int toStart = in.nextInt();
		if (toStart != 0) {
			while(true) {
				System.out.println("Choose Account Number from below(choose as 1 or 2 which is assigned to them)");
				for(int i = 0; i < 3; i++) {
					System.out.println(i+1+".."+acc[i].getAccNo());
				}
				System.out.println("4..Exit");
				
				int accOpt = in.nextInt();
				if(accOpt == 4) {
					break;
				}
				Account a = acc[accOpt - 1] ;
				
				
//				ask what to do witdraw or deposit
				System.out.println("1..Deposit\n2..Withdraw");
				int opt = in.nextInt();
				if (opt == 1) {
					System.out.println("Enter amount to Deposit: ");
					int amt = in.nextInt();
					a.deposit(amt);
					a.display();
				}else if (opt == 2) {
					System.out.println("Enter amount to Withdraw: ");
					int amt = in.nextInt();
					a.withdrawal(amt);
					a.display();
				}else {
					System.out.println("wrong Input");
				}
			}
		}
		
		System.out.println("\n\n_________Record Data__________\n\n");
		for(int i = 0; i < 3; i++) {
			acc[i].display();
		}
		
//		searching objects
		Scanner take = new Scanner(System.in);
		int ans = 0;
		System.out.println("\n\n______Search Account Number and Display their Details______");
		System.out.println("Enter Your Account Number: ");
		String name = take.nextLine();

	 	for (int i = 0; i < acc.length;i++) {
		    ans = acc[i].search(name); //String name is not getting passed
			if (ans == 1) {
				System.out.println("Accont found: ");
				acc[i].display();
				break;
			}
		}
		if(ans == 0) {
			System.out.println("Account Not found");
		}
	}

}

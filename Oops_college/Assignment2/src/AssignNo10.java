import java.util.Scanner;

/*Assign. No 10
A bank offers two types of accounts: savings a/c and Fixed A/c. each account is identified by accountno and has balance  and branch. The savings  A/c has interest rate whereas for the Fixed A/c , the interest rate as well the term i.e the number of years  are recorded. At run time the user should decide the type of account to create and display the details pertaining to the account created.
Objective: Inheritance,Polymorphism and dynamic binding. 
*/
public class AssignNo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account a1 = null;
		System.out.println("S for Savings Acoount and F for Fixed Account: ");
		String Atype = sc.nextLine();
		if (Atype.equalsIgnoreCase("S")) {
			a1 = new SavingsAccount(234798933,5000,"Ponda",5);
		}else if(Atype.equalsIgnoreCase("F")) {
			a1 = new FixedAccount(134598953,4000,"Ponda",6,5);
		}else {
			System.out.println("Invalid input");
		}
		
		if (a1 != null) {
			a1.display();
		}
	}

}

class Account{
	long accountno;
	int balance;
	String branch;
	
	protected void setDetails(long aNo, int bal, String branch) {
		accountno = aNo;
		balance = bal;
		this.branch = branch;
	}
	
	protected void display() {
		System.out.println("Account Number: "+accountno);
		System.out.println("Balance: "+balance);
		System.out.println("Branch: "+branch);
	}
}

class SavingsAccount extends Account{
	int interestRate;
	public SavingsAccount(long aNo, int bal, String bra, int iRate) {
		super.setDetails(aNo, bal, bra);
		interestRate = iRate;
	}
	
	public void display() {
		super.display();
		System.out.println("Interest Rate : "+interestRate);
	}
}

class FixedAccount extends Account{
	int interestRate;
	int term;
	
	public FixedAccount(long aNo, int bal, String bra, int iRate, int trm) {
		super.setDetails(aNo, bal, bra);
		interestRate = iRate;
		term = trm;
	}
	
	public void display() {
		super.display();
		System.out.println("Interest Rate : "+interestRate);
		System.out.println("Term: "+term+" years");
	}
}
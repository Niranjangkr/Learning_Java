/**
 * 
 * @author niranjangkr
 * @Date: 14/09/2002
 *
 */
class Account{
	long accno;
	int balance;
	
	/**
	 * 
	 * @param accno
	 * @param bal
	 */
	public Account(long accno, int bal) {
		this.accno = accno;
		balance = bal;
	}
	
	/**
	 * 
	 * @param accno
	 */
	public Account(long accno) {
		this.accno = accno;
	}
	
	public void display() {
		System.out.println("_________Info________\n");
		System.out.println("Account no. : "+accno);
		System.out.println("Balance : "+balance);
	}
	
	/**
	 * 
	 * @param amt
	 */
	public void deposit(int amt) {
		balance = balance + amt;
	}
	
	/**
	 * 
	 * @param amt
	 */
	public void withdraw( int amt) {
		balance = balance - amt;
	}
	
	public void transfer(Account a, int amt) {
		balance = balance - amt;
		a.deposit(amt);
	}
}
public class Objectparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Niraj = new Account(1245566,30000);
		Account Sam = new Account(12444,60000);
		
		Niraj.deposit(500);
		Niraj.display();
		
		Sam.display();
		Niraj.transfer(Sam, 1000);
		Sam.display();
		Niraj.display();
	}

}

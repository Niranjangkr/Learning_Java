package test1;
/*7.	Create a class named ‘Item’ with code(String) and price float as instance variables. Use appropriate constructors to initialize the same.  Create another class named Invoice which maintains an array of Item objects besides Invoice_no , store_name and amt . The store name is common for all the invoices.  Create a constructor which initializes the invoice_no and items list of invoice object. Write a display function for the invoice class which displays the Store name at the top (Ensure that the store_name is fetched by using an appropriate function.)  , invoice number and the list of items present on the invoice and the invoice amt which is computed as per the items present on the invoice. Write a search function in the Invoice class which searches for a Invoice based on the invoice number specified by the user and displays the invoice details    
Objective: array of objects as data members, static variables and static methods
*/
import java.util.Scanner;

class Item{
	String code;
	float price;
	
	public Item(String code, float price) {
		this.code = code;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Item code: "+code+"-------->$ = "+price);
	}
	
	public float getPrice() {
		return price;
	}
}

class Invoice{
	int invoice_no;
	Item[] itemarr = new Item[3];
	static String store_name = "Gokus's Store";
	float amt = 0;
	
//	Search
	public int search(int invnum) {
		if(invnum == invoice_no) {
			return 1;
		}
		return 0;
	}
	
	
	
	public void amount(float price) {
		amt = amt + price;
	}
	
	public String getStoreName() {
		return store_name;
	}
	
	public Invoice(int invoiceNum, Item[] I1) {
		invoice_no = invoiceNum;
		for (int i = 0; i < I1.length; i++) {
			itemarr[i] = I1[i];
			amount(itemarr[i].getPrice());
			
		}
	}
	
	public void display() {
		System.out.println("*******"+getStoreName()+"*******");
		System.out.println("Invoice Number: "+invoice_no);
		for (int i = 0; i < itemarr.length; i++) {
			itemarr[i].display();
		}
		System.out.println("Total                      $ = "+amt);
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Invoice[] invarr = new Invoice[3];//Generating Three invoices
		Item[] i1 = new Item[3];
		for (int j = 0; j < invarr.length; j++) {
			for (int i = 0; i < i1.length; i++) {
				System.out.println("Enter Item code for "+i+" index");
				String code = in.nextLine();
				System.out.println("Enter Item price for "+i+" index");
				float price = Float.parseFloat(in.nextLine());
				i1[i] = new Item(code, price);
			}
			System.out.println("Create/Generate/Write a Invoice Number: ");
			int incode = Integer.parseInt(in.nextLine());
		
			invarr[j] = new Invoice(incode, i1);
		}
		for (int i = 0; i <invarr.length;i++) {
			invarr[i].display();
		}
		
		System.out.println("Enter Invoice Number To Search : ");
		int invnum = in.nextInt();
		
		int check = 0;
		for (int i = 0; i <invarr.length;i++) {
			check = invarr[i].search(invnum);
			if (check == 1) {
				invarr[i].display();
				break;
			}
		}
		if (check == 0) {
			System.out.println("Not found");
		}
		
	}

}

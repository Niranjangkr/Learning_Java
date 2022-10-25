/*Assign. No 11
A book can be of type fiction or non-fiction. It is identified by bookid and has name,no. of pages , publisher as attributes. Create an abstract class called Book with getBookDetails and displayBookDetails as abstract methods. Create two classes Fiction and nonfiction which inherit the book class. Enter and display the details for the books created. 
Objective: use of abstract classes.
*/
public class Assign11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonFiction nf = new NonFiction();
		nf.getBookDetails("H123","Harry Potter and prisoner of Azakaban", 654, "J.K Rowlling");
		nf.displayBookDetails();
		
		Fiction f = new Fiction();
		f.getBookDetails("w123","World war", 544, "Alan");
		f.displayBookDetails();
	}

}

abstract class Book{
	public abstract void getBookDetails(String bookid, String bookname, int pgno, String publisher);
	public abstract void displayBookDetails();
	
}

class Fiction extends Book{
	static final String type = "Fiction";
	String bookid;
	String bookname;
	int pageno;
	String publisher;
	//override 
	public void getBookDetails(String bookid, String bookname, int pgno, String publisher) {
		this.bookid = bookid;
		this.bookname = bookname;
		pageno = pgno;
		this.publisher = publisher;
	}
	
	//override
	public void displayBookDetails() {
		System.out.println("*****"+type+"*****");
		System.out.println("Book name: "+bookname);
		System.out.println("Book id: "+bookid);
		System.out.println("Size: "+pageno+" pages");
		System.out.println("Published by: "+publisher); 
		System.out.println("\n");
	}
}

class NonFiction extends Book{
	static final String type = "Non-Fiction";
	String bookid;
	String bookname;
	int pageno;
	String publisher;
	//override 
	public void getBookDetails(String bookid, String bookname, int pgno, String publisher) {
		this.bookid = bookid;
		this.bookname = bookname;
		pageno = pgno;
		this.publisher = publisher;
	}
	
	//override
	public void displayBookDetails() {
		System.out.println("*****"+type+"*****");
		System.out.println("Book name: "+bookname);
		System.out.println("Book id: "+bookid);
		System.out.println("Size: "+pageno+" pages");
		System.out.println("Published by: "+publisher); 
	}
}
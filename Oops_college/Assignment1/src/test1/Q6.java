/*6.	Create a class called Book with bookname(String),subject(String),publisher (class type Publisher) and authors(array of class type Author) as data members. Create a class named Publisher with pname(String) and telephone(String) as instance variables. Create a class called Author with aname(String) ,telephone(String)and address(String) as datamembers. Include appropriate constructors and methods to set the instance variables and display the details in  each of these classes. In the testing class create an object of Book type which has a publisher object and an array of two Author objects. Display the Book details along with the publisher and the author details.
Objective: constructors, array of objects.
*/

package test1;

class Book{
	String bookname;
	String Subject;
	Publisher Publisher;//class
	Author[] authors = new Author[2];//class
	
	public Book(String bname, String sub, Publisher p,Author[] aut) {
		bookname = bname;
		Subject = sub;
		Publisher = p;
		for (int i = 0; i < aut.length; i++) {
			authors[i] = aut[i];
		}
	}
	
	
	public void display() {
		System.out.println("*********BOOK DETAILS**************\n");
		System.out.println("Book Name: "+bookname);
		System.out.println("Genre: "+Subject);
		Publisher.display();
		for(int i = 0; i < authors.length; i++) {
			authors[i].display();
		}
	}
}

class Publisher{
	String pname;
	String telephone;
	
	public Publisher(String pname, String tel) {
		this.pname = pname;
		telephone = tel;
	}
	
	public void display() {
		System.out.println("Publisher Name: "+pname);
		System.out.println("Publisher's Telephone no. : "+telephone);
	}
}

class Author{
	String aname;
	String telephone;
	String address;
	
	public Author(String name, String tel, String add) {
		aname = name;
		telephone = tel;
		address = add;
	}
	
	public void display() {
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Author's Name: "+aname);
		System.out.println("Author's tel no.: "+telephone);
		System.out.println("Authors add.: "+address);
	}
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author[] aut = new Author[2];
		aut[0] = new Author("Masashi Kishimoto", "8219848919", "Japan");
		aut[1] = new Author("Jiraya The Galet(Toad sage)", "Ninja-Scroll", "The Hidden leaf Village");
		Publisher p1 = new Publisher("Anime_Studio", "9384881209");
		Book b1 = new Book("The tale of Naruto Uzumaki", "Shonen", p1, aut);
		b1.display();
	}

}

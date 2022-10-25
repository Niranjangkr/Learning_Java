import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Enter ptype: ");
		Scanner sc = new Scanner(System.in);
		String ptype = sc.nextLine();
		Person p = null;
		if(ptype.equalsIgnoreCase("E")) {
			p = new Employee("Niranjan","Kalay", "E-12",50000);
		} else if(ptype.equalsIgnoreCase("C")) {
			p = new Customer("Harry","London","C-12",5);
		}else {
			System.out.println("Invalid input");
		}
		
		if(p != null) {
			p.display();
		}
	}
}

class Person{
	protected String name;
	protected String address;
	
	public Person (String n, String add) {
		name = n;
		address = add;
	}
	
	protected void display() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}

class Employee extends Person {
	 private String empid;
	 private int sal;
	 
	 public Employee(String n, String add, String empid, int sal) {
		 super(n, add);
		 this.empid = empid;
		 this.sal = sal;
	 }
	 
	 public void display() {
		 super.display();
		 System.out.println("Employee id: "+empid);
		 System.out.println("Salary: "+sal);
	 }
}

class Customer extends Person {
	 private String Cusid;
	 private int rat;
	 
	 public Customer(String n, String add, String cusid, int rat) {
		 super(n, add);
		 this.Cusid = cusid;
		 this.rat = rat;
	 }
	 
	 public void display() {
		 super.display();
		 System.out.println("Customer id: "+Cusid);
		 System.out.println("Rating: "+rat);
	 }
}
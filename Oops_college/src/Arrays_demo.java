import java.util.Scanner;

class Employee{
	String ssn;
	String name;
	int salary;
	
	public Employee(String ssn, String name, int salary) {
		this.ssn = ssn;
		this.name = name;
		this.salary = salary;
	}
	
	public void display(){
		System.out.println("SSN "+ssn );
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("\n");
	}
}

public class Arrays_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Employee[] emps = new Employee[3];
		for (int i = 0; i < emps.length; i++) {
			System.out.println("Enter ssn: ");
			String ssn = in.nextLine();
			System.out.println("Enter name: ");
			String name = in.nextLine();
			System.out.println("Enter salary: "); 
			int salary = Integer.parseInt(in.nextLine());
			
			emps[i] = new Employee(ssn, name, salary);
		}
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].display();
		}

	}

}

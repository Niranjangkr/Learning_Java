import java.util.ArrayList;
import java.util.Scanner;

/*Assign No 15 
A company has 5 departments namely ‘Production’, ‘HR’,’Sales’,Advertisement’, ‘Accounts’. Each department has dno and some budgetary allocation besides the name. Using the collection framework, write a Java program which stores the department details and also lists the departments in the descending order of their budget allocation and also searches and displays the department given its dno.
*/
public class Ass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Department> comp = new ArrayList<Department>();
		comp.add(new Department("Production", 124,50045 ));
		comp.add(new Department("HR", 123,60045 ));
		comp.add(new Department("Sales", 127,70045 ));
		comp.add(new Department("Advertisement", 126,90045 ));
		comp.add(new Department("Accounts", 125,88045 ));
		
		comp.sort(null);
//		System.out.println(comp);
		for (int i = comp.size() - 1; i >= 0; i--) {
			System.out.println(comp.get(i));
		}
		
//		 searches and displays the department given its dno
		Scanner in = new Scanner(System.in);
		System.out.println("Enter dno of the Department you want to search: ");
		int dno = in.nextInt();
		boolean isThere = false;
		for (int i = 0; i < comp.size() - 1; i++) {
			if (comp.get(i).search(dno)) {
				System.out.println(comp.get(i));
				isThere = true;
			}
		}
		if (isThere != true) {
			System.out.println("No Department with dno: "+dno);
		}
 }
}

class Department implements Comparable<Department>{
	String dname;
	int dno;
	int budget;
	
	public Department(String name, int no, int money) {
		this.dname = name;
		dno = no;
		budget = money;
	}
	
	public String toString(){
		return dno+"-->"+dname+"-->"+"-->"+budget+"\n";
	}
	
	boolean search (int dno) {
		if (this.dno == dno) {
			return true;
		}else {
			return false;
		}
	}
	

	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return this.budget - o.budget;
	}
 }


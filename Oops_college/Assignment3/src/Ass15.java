import java.util.ArrayList;

/*Assign No 15 
A company has 5 departments namely ‘Production’, ‘HR’,’Sales’,Advertisement’, ‘Accounts’. Each department has dno and some budgetary allocation besides the name. Using the collection framework, write a Java program which stores the department details and also lists the departments in the descending order of their budget allocation and also searches and displays the department given its dno.
*/
public class Ass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Department> comp = new ArrayList<Department>();
		comp.add(new Department("Production", 123,50045 ));
		comp.add(new Department("HR", 124,60045 ));
		comp.add(new Department("Sales", 125,70045 ));
		comp.add(new Department("Advertisement", 126,80045 ));
		comp.add(new Department("Accounts", 127,88045 ));
		
		comp.sort(null);;
		System.out.println(comp);
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

	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return this.budget - o.budget;
	}
}

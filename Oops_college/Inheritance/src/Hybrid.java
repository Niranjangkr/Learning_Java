//Hybrid referring Demo2.java
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadManager h1 = new HeadManager("Samir", "Mumbai", "HM-1", 150000,69,"Special", 10);
		h1.display();
	}

}

class HeadManager extends SeniorEmployee{
	private int noOfteamsAssigned;
	public HeadManager(String n, String add, String empid, int sal, int age, String level, int teamsCount) {
		super(n, add, empid, sal, age, level);
		noOfteamsAssigned = teamsCount;
	}
	
	public void display() {
		super.display();
		System.out.println("Number of teams assigned: "+noOfteamsAssigned);
	}
}
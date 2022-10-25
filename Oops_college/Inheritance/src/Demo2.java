//Multilevel
public class Demo2 {
	public static void main(String args[]) {
		RetiredEmployee r1 = new RetiredEmployee("Savan", "Cacora", "S1",80000, 65, "Final", 20000);
		r1.display();
	}
	
}

class SeniorEmployee extends Employee {
	private int age;
	private String level;
	
	public SeniorEmployee(String n, String add, String empid, int sal, int age, String level) {
		super(n, add, empid, sal);
		this.age = age;
		this.level = level;
	}
	
	public void display() {
		super.display();
		System.out.println("Age: "+age);
		System.out.println("Level: "+level);
	}
}

class RetiredEmployee extends SeniorEmployee {
	private int age;
	private String level;
	int pension;
	
	public RetiredEmployee(String n, String add, String empid, int sal, int age, String level, int pen) {
		super(n, add, empid, sal, age, level);
		pension = pen;
	}
	
	public void display() {
		super.display();
		System.out.println("Pension: "+pension);
	}
}
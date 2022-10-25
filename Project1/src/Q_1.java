/*1.	Create a class named Paper with the following instance variables:
Pcode(String) , Pname(String), classname(String),MaxMarks(int),MinMarks(int). Create atleast 3 different constructors and appropriate methods with the same name ‘setDetails’ to set the instance variables values. Also include a display function to display the paper details.
Objective: Constructor and method overloading
*/

// to toggle Shift + Alt + Y

class Paper{
	String Pcode;
	String Pname;
	String Classname;
	int MaxMarks;
	int MinMarks;
	
	public Paper(String Pcode, String Pname, String Classname) {
		this.Pcode = Pcode;
		this.Pname = Pname;
		this.Classname = Classname;
	}
	
	public Paper(int MaxMarks, int MinMarks) {
		this.MaxMarks = MaxMarks;
		this.MinMarks = MinMarks;
	}
	
	public Paper() {
		// TODO Auto-generated constructor stub
	}

	public  Paper(String Pcode, String Pname, String Classname, int MaxMarks, int MinMarks) {
		this.Pcode = Pcode;
		this.Pname = Pname;
		this.Classname = Classname;
		this.MaxMarks = MaxMarks;
		this.MinMarks = MinMarks;
	}
	
	
	
	public void SetDetails(String Pcode, String Pname, String Classname,int MaxMks, int MinMks) {
		this.Pcode = Pcode;
		this.Classname = Classname;
		this.Pname =  Pname;
		MaxMarks =  MaxMks;
		MinMarks = MinMks;
		
	}
	
	public void Display() {
		System.out.println(Pcode+ " "+ Classname+ " "+ Pname+ " "+MaxMarks+" "+MinMarks);
	}
	
	
}

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper p1 = new Paper();
		p1.SetDetails("123", "cs", "jkdsa", 123, 122);
		p1.Display();
		
		System.out.println("");
		
		Paper p2 = new Paper("123","cs","sybsc",600,300);
		p2.Display();
		
	}

}

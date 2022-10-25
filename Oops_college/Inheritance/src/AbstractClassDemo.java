
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("pranav","S20-787","CS");
		s1.processMarks();
		s1.displayMarks();
	}

}

abstract class MarkSheet{
	String examCode;
	public MarkSheet(String ec) {
		examCode = ec;
	}
	
	public abstract void processMarks();
	public abstract void displayMarks();
}

class Student extends MarkSheet{
	String roll, name;
	public Student(String n, String r, String ec) {
		super(ec);
		roll = r;
		name = n;
	}
	@Override
	public void processMarks() {
		// TODO Auto-generated method stub
		System.out.println("processing...");
	}
	@Override
	public void displayMarks() {
		// TODO Auto-generated method stub
		System.out.println("displaying...");
	}
	
	
}
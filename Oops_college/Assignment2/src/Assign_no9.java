import java.util.Scanner;

/*Assign no 9
Create a class named ‘Activity’ with Activity_code,Activity_name as data members and two methods – setDetails and display to set the details and display the activity details respectively. Create two more classes InternalAcivity and ExternalActivity  which extend the Activity class. The internalActivity class has person_incharge as its own data member whereas the externalActivity has collegeName as its own data member. Use appropriate constructors and methods to set and display the details pertaining to external and internal activities. Create a test class called ActivityTest to test the functionality of the above classes.    Objective : Single inheritance, method overriding
*/
public class Assign_no9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Atype;
		Activity a = null;
		System.out.println("I for InterActivity and E for ExternalActivity: ");
		Scanner sc = new Scanner(System.in);
		Atype = sc.nextLine();
		
		if (Atype.equalsIgnoreCase("I")) {
			a = new InternalActivity("A-123","Chess","Raj Gaonkar");
		} else if(Atype.equalsIgnoreCase("E")) {
			a = new ExternalActivity("A-44", "Cricket", "GCQ");
		}else {
			System.out.println("Invalid input");
		}
		
		if(a != null) {
			a.display();
		}
	}

}

class Activity{
	protected String Activity_code;
	protected String Activity_name;
	
	protected void setDetails(String Ac, String An) {
		Activity_code = Ac;
		Activity_name = An;
	}
	
	protected void display() {
		System.out.println("Activity code: "+Activity_code );
		System.out.println("Activity name: "+Activity_name );
	}
}

class InternalActivity extends Activity{
	private String personInCharge;
	public InternalActivity(String Ac, String An, String pC) {
		super.setDetails(Ac,An);
		personInCharge = pC;
		
	}
	
	protected void display() {
		super.display();
		System.out.println("Person in charge: "+personInCharge);
	}
}

class ExternalActivity extends Activity{
	private String collegeName;
	
	public ExternalActivity(String Ac, String An, String cN) {
		super.setDetails(Ac, An);
		collegeName = cN;
	}
	
	protected void display() {
		super.display();
		System.out.println("College Name: "+collegeName);
	}
}
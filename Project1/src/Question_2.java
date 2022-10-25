/*2.	create a class named theatre with the following instance variables:
tname (string)
tlocation(string)
capacity(int)
 rating(float)
initialize the above instance variables to default values using an appropriate constructor. also include two more constructors  one to initialize the tname and tlocation and another one  to initialize only the tname. use the getter and setter methods to set /get the capacity and rating values.
objectives: constructor overloading/getter-setter methods.
*/

class Theater{
	String Tname;
	String Tlocation;
	int Capacity;
	float Rating;
	
	public Theater (String Tname, String Tlocation, int Capacity, float Rating) {
		this.Tname = Tname;
		this.Tlocation = Tlocation;
		this.Capacity = Capacity;
		this.Rating = Rating;
		
	}
	
	public Theater (String Tname, String Tlocation) {
		this.Tname = Tname;
		this.Tlocation = Tlocation;
		
	}
	
	
	public Theater (String Tname) {
		this.Tname = Tname;
	}

//	Getter and Setter

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public float getRating() {
		return Rating;
	}

	public void setRating(float rating) {
		Rating = rating;
	}
	
	public void ShowDetails() {
		System.out.println("Name of theater is "+Tname);
		System.out.println("Location of Theater is "+Tlocation);
	}
	
	
}

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is T1");
		Theater t1 = new Theater("Inox", "Margao", 5000, 9);
		System.out.println("Rating is "+t1.getRating());
		System.out.println("Capacity is "+t1.getCapacity());
		t1.ShowDetails();
		
		System.out.println("'\nThis is T2");
		Theater t2 = new Theater("Inox", "Panajim");
		t2.setCapacity(4000);
		t2.setRating(10);
		System.out.println("Rating is "+t2.getRating());
		System.out.println("Capacity is "+t2.getCapacity());
		t2.ShowDetails();
		
		System.out.println("\nThis is T3");
		Theater t3 = new Theater("IMax");
		t3.setCapacity(1899);
		t3.setRating(7);
		System.out.println("Rating is "+t3.getRating());
		System.out.println("Rating is "+t3.getCapacity());
		t3.ShowDetails();
		
	}

}

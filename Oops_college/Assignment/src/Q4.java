/*4.	Create a class called Location with xposition(int) and yposition(int) as instance variables. Include appropriate constructor to initialize these variables. In the main method create two instances of the Location class :SourceLocation and DestLocation. Create a method called moveTo which moves the sourceLocation to the DestLocation. Also include a display function which displays the Location details.
Objective: Object as method parameter.*/

class Location{
	int xposition;
	int yposition;
	
	public Location(int x, int y) {
		xposition = x;
		yposition = y;
	}
	
	public void moveTo(Location a) {
		xposition = a.xposition;
		yposition = a.yposition;
	}
	
	public void Display() {
		System.out.println("__________________________\n\n");
		System.out.println("Location x is "+ xposition);
		System.out.println("Location y is "+ yposition);
	}
}


public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location SourceLocation = new Location(25,12);
		SourceLocation.Display();
		Location DestinationLocation = new Location(15,8);
		DestinationLocation.Display();
		DestinationLocation.moveTo(SourceLocation);
		DestinationLocation.Display();
		SourceLocation.Display();
		
		
	}

}

/*5.	Create a class named ISLClub with name (String) , location(String) and Coach(ISLCoach class type) as instance variables. Create another class called ISLCoach with coachname(String), country(String) and age(int) as data members. Include a 3-argument constructor In this class which initializes all these 3 variables. In the ISLClub class create a constructor which initializes only the name of the club and another one which initializes all the three variables including the Coach. Also include setDetails method to set the values of  the remaining variables  including the coach. Incorporate the display functions in both these classes to display the details of the respective objects.
Objective : Object as instance variables, object as function parameter.   
*/

package test1;
class ISLClub{
	String name;
	String location;
	ISLCoach Coach;
	
	public ISLClub(String name) {
		this.name = name;
	}
	
	public ISLClub(String name, String location, ISLCoach a) {
		this.name = name;
		this.location = location;
		Coach = a;
	}
	
	public void setDetails(String location, ISLCoach a) {
		this.location = location;
		Coach = a;
	}
	
	public void display() {
		System.out.println("\n\n_____"+name+"______");
		System.out.println("Location: "+location);
		Coach.display();
	}
}

class ISLCoach{
	String coachname;
	String country;
	int age;
	
	public ISLCoach(String coachname, String country, int age) {
		this.coachname = coachname;
		this.country = country;
		this.age = age;
	}
	
	public void display() {
		System.out.println("\n____Coach Details______");
		System.out.println("Name: "+coachname);
		System.out.println("Country: "+country);
		System.out.println("Age: "+age);
	}
}

public class Q5 {
	public static void main(String args []) {
		System.out.println("********ISL CLUB********");
		ISLCoach coach1 = new ISLCoach("MSD", "India", 37);
		ISLClub club1 = new ISLClub("GCQ-Challenger", "Goa-Quepem",coach1);
		club1.display();
	}

}


public class hieararichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c1 = new Cricket(20,"outdoor",11);
		c1.display();
		Football f1Football = new Football(48,"outdoor",11);
		f1Football.display();
	}

}

class Sports{
	int noOfcountry;
	String type;
	
	public Sports(int cno, String type) {
		noOfcountry = cno;
		this.type = type; 
	}
	public void display() {
		System.out.println("Sports type "+type);
		System.out.println("No. of Players are "+noOfcountry);
		
	}
}

class Cricket extends Sports{
	int noOfplayers;
	public Cricket(int cno, String type, int noPlayers) {
		super(cno, type);
		System.out.println("***Cricket game***");
		noOfplayers = noPlayers;  
	}
	public void display() {
		System.out.println("Sports type "+type);
		System.out.println("No. of Players are "+noOfplayers);
		System.out.println("Number of country plays "+noOfcountry);
	}
}

class Football extends Sports{
	int noOfplayers;
	public Football(int cno, String type, int noPlayers) {
		super(cno, type);
		System.out.println("***Football game***");
		noOfplayers = noPlayers;  
	}
	public void display() {
		System.out.println("Sports type "+type);
		System.out.println("No. of Players are "+noOfplayers);
		System.out.println("Number of country plays "+noOfcountry);
	}
}
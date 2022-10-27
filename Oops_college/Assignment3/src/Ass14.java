/*Assign no: 14 
Using an appropriate class/interface from the Java Collection Framework, write a program to store marks scored in various subjects by a student. The program should   display the marks in all these subjects as well as for a particular subject specified by the user and also the total marks scored.
*/
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Ass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> marksheet = new HashMap<String, Integer>();
		marksheet.put("English", 80);
		marksheet.put("Marathi", 75);
		marksheet.put("Hindi", 80);
		marksheet.put("Science", 90);
		marksheet.put("Maths", 85);
		marksheet.put("Geography", 80);
		marksheet.put("History", 80);
		
		int total = 0;
		Scanner in = new Scanner(System.in);
		for (int mks: marksheet.values()) {
			total += mks;
		}
		
		System.out.println(marksheet);
		System.out.println("Total is "+total);
		
		System.out.println("Enter Subject to Know marks: ");
		String key = in.nextLine();
		if (key != null) {
			System.out.println("Marks is "+marksheet.get(key));
		}else {
			System.out.println("Not found");

		}
	}

}

//
//public class StudentTest {
//	public static void main(String[] args) {
//		Studentt s1 = new Studentt("Niranjan", "S20-403");
//		s1.bloodDonation(11);
//		s1.nationalDays(12);
//		s1.display();
//		
//}
//
//class Studentt implements NSSActivities{
//	private int totalHours;
//	private String name;
//	private String rollno;
//	
//	public Studentt(String n, String roll) {
//		name = n;
//		rollno = roll;
//	}
//	
//	//override
//	public void bloodDonation(int hrs) {
//		totalHours = totalHours + hrs;
//	}
//	
//	//override
//	public void nationalDays(int hrs) {
//		totalHours = totalHours + hrs;
//	}
//	
//	public void display() {
//		rules();
//		if (totalHours > 20) {
//			totalHours = totalHours + extrahours;
//		}
//		
//		System.out.println("Name: "+name);
//		System.out.println("Total Hours: "+totalHours);
//	}
//
//}

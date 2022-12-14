import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.add(1);
//		nums.add(43);
//		nums.add(23);
//		nums.add(12);
//		nums.add(15);
//		nums.add(33);
//		nums.sort(null);
//		System.out.println("Sorted ");
//		for(int i = 0; i < nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
//		Collections.reverse(nums);
//		System.out.println("Reverse");
////		System.out.println(nums);
//		for ( int i:nums) {
//			System.out.println(i);
//		}
//		
//		Strings
//		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Niranjan");
//		names.add("Ben");
//		names.add("Goku");
//		names.add("Zoro");
//		System.out.println(names);
		
		//objects
		ArrayList<Employe1e> emps = new ArrayList<Employe1e>();
		emps.add(new Employe1e("Niranjan",403));
		emps.add(new Employe1e("Hori", 35));
		emps.add(new Employe1e("Miyamura", 34));
		
		for(Employe1e e: emps) {
			System.out.println(e);
		}
		
		emps.sort(null);
//		System.out.println(emps);
		System.out.println("Sorted");
		for (Employe1e e: emps) {
			System.out.println(e);
		}
	}

}

class Employe1e implements Comparable<Employe1e>{
	String name;
	int rollno;
	
	public Employe1e(String name, int rno) {
		this.name = name;
		rollno= rno;
	}
	
	public String toString() {
		return name+" "+rollno+"\n";
		
	}

	@Override
	public int compareTo(Employe1e arg0) {
		// TODO Auto-generated method stub
		return (this.rollno-arg0.rollno);
	}
	
}

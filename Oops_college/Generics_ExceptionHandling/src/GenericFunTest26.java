import java.util.ArrayList;
public class GenericFunTest26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer nums [] = {1, 2, 3, 44, 45, 12};
		String[] names = {"Niranjan", "Goku", "Yodha", "Midoriya", "Ichgigo"};
		Character[] chs = {'Z', 'O', 'R', 'O'};
		printArray(nums);
		System.out.println("");
		printArray(names);
		System.out.println("");
		printArray(chs);
		
		Student11[] sts = new Student11[4];
		sts[0] = new Student11("Niranjan", 21);
		sts[1] = new Student11("dfs", 21);
		sts[2] = new Student11("dsa", 21);
		sts[3] = new Student11("nnn", 21);
		
		System.out.println("");
		printArray(sts);
	}
	public static <T> void printArray(T[] arr) {
		for(T e: arr) {
			System.out.print(e+" ");
		}
	}*/
	
	 ArrayList name = new ArrayList();
	 name.add("Hello");
	 name.add("Challo");
	 name.add("welcome");
	 
	 String name1=(String)name.get(0);
	 String name2=(String)name.get(1);
	 String name3=(String)name.get(2);
	 System.out.println(name1);

 }
}
class Student11{
	String name;
	int age;
	
	public Student11(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" "+age;
	}
}
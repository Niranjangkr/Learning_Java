
public class GenericrTest25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe2e<String, Integer> e1 = new Employe2e<String, Integer>("Niranjan", 403);
		e1.display();
		Employe2e<String, String> e2 = new Employe2e<String, String>("Luffy", "One Piece");
		e2.display();
		Employe2e<Integer, Integer> e3 = new Employe2e<Integer, Integer>(160, 162);
		e3.display();
	}		

}

class Employe2e<T, U>{
	T val1;
	U val2;
	
	public Employe2e(T val1, U value) {
		this.val1 = val1;
		val2 = value;
	}
	
	public void display() {
		System.out.println(val1);
		System.out.println(val2);
	}
}
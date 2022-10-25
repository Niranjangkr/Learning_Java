
public class ThrowTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Compute(9);
			Compute(100);
		} catch (Exception o) {
			// TODO Auto-generated catch block
			o.printStackTrace();
		}
		finally {
			System.out.println("This is finally");
		}
		System.out.println("jii");
	}
	public static void Compute(int i ) throws Exception{
		if (i < 10) {
			System.out.println("Normal Execution");
		}
		else {
			throw new Exception("error due to "+i);
		}
	}
}

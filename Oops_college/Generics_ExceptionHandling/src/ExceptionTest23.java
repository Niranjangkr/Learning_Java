
public class ExceptionTest23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Compute(40);
			Compute(10);
		}catch(MyException e) {//here instead of MyException you can write Exception also
			System.out.println(e);
		}
	}
	public static void Compute(int i ) throws MyException{
		if (i > 20) {
			throw new MyException(i);
		}else {
			System.out.println("Normal execution");
		}
	}
}

class MyException extends Exception{
	int i;
	public MyException(int i) {
		this.i = i;
	}
	
	public String toString(){
		return "Exception- "+i;
	}
}

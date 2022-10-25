import sun.awt.geom.AreaOp.AddOp;

class OurMath{
	public static int add(int x, int y) {
		return x + y;
	}
	public static int mul(int x, int y) {
		return x * y;
	}
	public static double sqroot(double x) {
		return Math.round(Math.sqrt(x)*100.0/100.0);
	}
}
public class ContainerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add: "+OurMath.add(12, 12));
		System.out.println("Mul: "+OurMath.mul(12, 10));
		System.out.println("Square root: "+OurMath.sqroot(12.00));
	}

}

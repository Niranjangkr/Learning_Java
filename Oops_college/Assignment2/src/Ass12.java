/*Create an interface called GeomFigure with area() and perimeter() as abstract methods . Create two classes Rectangle and Triangle with appropriate data members and which implement this interface to compute the area and perimeter of the respective geometrical figures.
Objective: Use of interfaces*/

interface GeomFigure{
	public abstract void area();
	public abstract void perimeter();
}

class Rectangle implements GeomFigure{
	int area, peri;
	int l,w;
	public Rectangle(int l, int b) {
		this.l = l;
		w = b;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = l * w;
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		peri =  2 * (l + w);
	}
	
	public void getDetails() {
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+peri);
	}
}

class Triangle implements GeomFigure{
	int  peri;
	double area;
	int h, b, hy;
	public Triangle(int h, int b, int hy) {
		this.h = h;
		this.b = b;
		this.hy = hy; 
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = 0.5 *( b * h);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		peri =  h + b + hy;
	}
	
	public void getDetails() {
		System.out.println("Area of Triangle: "+area);
		System.out.println("Perimeter of Triangle: "+peri);
	}
	
}

public class Ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5, 10);
		Triangle t1 = new Triangle(10,5,15);
		t1.area();
		t1.perimeter();
		r1.area();
		r1.perimeter();
		
		r1.getDetails();
		t1.getDetails();
	}

}

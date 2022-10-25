
public class GenricTessst {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  EmploYYyee12<String,Integer> e = new EmploYYyee12<String,Integer>("Sarah",20);
  e.display();
  
  EmploYYyee12 <String,String> e1= new EmploYYyee12<String,String>("Saish","Curchorem");
  e1.display();
 }

}

class EmploYYyee12<T,U>{
 T val1;
 U val2;
 public EmploYYyee12(T v1,U v2)
 {
  val1=v1;
  val2=v2;
  
 }
 public void display()
 {
  System.out.println(val1);
  System.out.println(val2);
  
 }
}

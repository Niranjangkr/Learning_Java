/*Assign . No 13
 An exam Marksheet includes Student’s rollno, name , class and exam details such as semester, month and year  besides the grand total and grade.  Create an abstract  class called Student with getStudent details and displayStudent Details    as abstract methods . 
 
 Create an interface called exam and initialize the month,year and semester to constant values and have getExamInstruction   as default method to display exam instructions and displayExamDetails as  abstract method  in this interface  .
 
  The Marksheet class extends the Student class  and implements the Exam interface. Display the marksheet details.
Objective :Use of interface and abstract class 
*/

interface exam{
	public static final String month = "July";
	public static final int year = 2022;
	public static final String sem = "V";
	
	public default void getExamInstruction() {
		System.out.println("No copy");
	}
	
	public abstract void displayExamDetails();
	
}

abstract class Student{
	public abstract void getStudentDetails();
	public abstract void displayStudentDetails();
}

public class Ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

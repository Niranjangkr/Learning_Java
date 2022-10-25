import java.util.Scanner;

public class Mess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[5];
		int num = 0;
		int max = Integer.MIN_VALUE;	//Integer.MIN_VALUE instead 0 
		Scanner input = new Scanner(System.in);
		
		 while(num<5) {
			 System.out.print("Enter values: ");
			 list[num]=input.nextInt(); // Scanner is called input
			 num++;
			 }
		 
		 for (int i = 0; i < num; i++) {
			 if(max < list[i]) {
				 max = list[i];
			 }
		 }
		 System.out.println(max);

	}

}



/*1. How did you fix the ArrayIndexOutOfBoundsException? Why did you not need breakpoints to help solve that problem?
Ans.  In error message they showed the line number at which the error occurred,evaluating that line I realized what mistake I made. I just fixed the condition, which was wrong as the size of array was five but in loop it was making six iteration asking for one extra element.
 */


/*	2. How did you fix the problem of getting the wrong max value when you ran the program on
input -5, -3, -7, -2, -6? Specifically, where did you insert your breakpoints (on what instructions) and what was the problem?
Ans. I added the BreakPoint at the second loop that is at for loop where Max was supposed to get updated in new values but there i realized that statement if(max < list[i]) was not getting true at all then I saw the Max variable was already assigned with 0 which is actually greater than the negative numbers 
and so i assigned Max variable with INTEGER.MIN_VALUE instead 0 at beginning to solve the problem
 */


/* 3. In general, what does the debugger allow you to do? Under what circumstances do you plan on using the debugger? In particular, what types of errors will it help you to resolve and fix?
Ans. Debugger allowed me to dry run my function that is I got to view what actually was happening in the code step by step at the runtime which made me identify the logical errors i was making.
it helps us to identify and fix our logical errors 
 */


/* 4. What use is the run trace in the Debug pane? That is, what information is displayed there?
Ans. 
 */

/*5. In general, where would you plan on placing breakpoints when debugging code? That is, in what types of instructions?
Ans.Am planning to add breakpoints where am actually writing any logical part like at conditions statements or at the beginning of any loop , or at any function or method.

first I'll see what type of error am getting like if am getting unexpected result/output then i'll check where that output is getting generated , if its in a particular method then I'll add the breakpoint where that method is being called.
*/

/*Submit either by hard copy or email your source code for Mess and the answers to the above questions.
 */


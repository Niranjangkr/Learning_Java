import java.util.Scanner;

public class CeilingWrapAround1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a', 'b', 'd', 'f', 'h'};
		char value = 'a';
//		Scanner in = new Scanner(System.in);
//		System.out.println("Find Ceiling of : ");
//		value = in.nextInt();
		char ans = BinarySearch(arr, value);
		System.out.println(ans);

	}
	
	public static char BinarySearch(char [] arr, char value) {
		int min = 0 ;
		int max = arr.length-1;
		int mid = min + (max - min)/2;
		while(min <= max){
			if (value == arr[mid]) {
				return arr[mid % (arr.length) + 1];
			}else if (arr[mid] > value) {
				max = mid - 1;
				mid = min + (max - min)/2;
			}else {
				min = mid + 1;
				mid = min + (max - min)/2;
			}
		}
		
	return(arr[min % (arr.length)]);
	
	}

}

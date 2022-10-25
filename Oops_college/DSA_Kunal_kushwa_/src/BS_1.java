import java.util.*;

public class BS_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,45,67,88,89};
		int value;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value to search: ");
		value = in.nextInt();
		System.out.println(BinarySearch(arr, value));

		
	}


	public static int BinarySearch(int [] arr, int value) {
		int min = 0 ;
		int max = arr.length - 1;
		int mid = min + (max - min)/2;
		while(min <= max){
			if (value == arr[mid]) {
				return mid;
			}else if (arr[mid] > value) {
				max = mid - 1;
				mid = min + (max - min)/2;
			}else {
				min = mid + 1;
				mid = min + (max - min)/2;
			}
		}
		
	return(-1);
	
	}

}

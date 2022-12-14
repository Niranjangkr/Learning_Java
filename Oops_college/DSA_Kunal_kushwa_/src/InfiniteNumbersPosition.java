import java.util.Scanner;

public class InfiniteNumbersPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] arr = {1, 2, 23, 24, 33, 34, 45, 46, 66, 123, 455};
		int target;
		System.out.println("Enter value to search: ");
		target = in.nextInt();
		int end = 0;
		int start = 0;
		while (target > arr[end] ) {
			int temp = end + 1; // new start;
			end = end + (end - start + 1) * 2; // increasing the size
			start = temp;
		}
		int ans = BinarySearch(arr, target, start, end);
		System.out.println("Index value is "+ans);
	}
	public static int BinarySearch(int [] arr, int value, int start, int end) {
		int min = start ;
		int max = end;
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

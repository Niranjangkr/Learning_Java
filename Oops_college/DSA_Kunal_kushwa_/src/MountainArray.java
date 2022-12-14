
public class MountainArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 8, 9, 10, 65, 8, 4, 2, 1};
		int peak = BinarySearch(arr);
		System.out.println(peak);
		
	}
	
	public static int BinarySearch(int [] arr) {
		int min = 0 ;
		int max = arr.length - 1;
		int mid = min + (max - min)/2;
		while(min != max){
			if (arr[mid] > arr[mid+1]) {
				max = mid;
				mid = min + (max - min)/2;
			}else if (arr[mid] < arr[mid + 1]) {
				min = mid + 1;
				mid = min + (max - min)/2;
			}
		}
		
	return(arr[min]);
	
	}
}

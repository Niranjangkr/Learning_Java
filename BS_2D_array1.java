import java.util.Arrays;

public class BS_2D_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] arr = {
					{10, 20, 30, 40},
					{15, 25, 35, 45},
					{28, 37, 42, 55}
			};
			int target =  55;
			int[] ans = Search(arr, target);
			System.out.println(Arrays.toString(ans));
	}
	static int[] Search(int[][] arr, int target) {
		int r = 0;
		int col = arr[0].length - 1;
		
		while (r < arr.length && col >= 0) {
			if (arr[r][col] == target) {
				return new int[] {r, col};
			}else if (arr[r][col] > target) {
				col --;
			}else {
				r++;
			}
		}
		return new int[] {-1, -1};
	}

}

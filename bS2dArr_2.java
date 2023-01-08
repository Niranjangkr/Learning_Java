import java.util.Arrays;

public class bS2dArr_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		
		int[] ans = search(matrix, 9);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] binarySearch(int[][] matrix, int row, int rStart, int rEnd, int target) {
		while (rStart <= rEnd) {
			 int rMid = rStart + (rEnd - rStart)/2;
			 if (matrix[row][rMid] == target) {
				 return new int[] {row, rMid};
			 }
			 if (matrix[row][rMid] < target) {
				 rStart = rMid + 1;
			 }else {
				 rEnd = rMid - 1;
			 }
		}
		return new int[] {-1, -1};
	}
	
	static int[] search(int[][] matrix, int target) {
		int rows = matrix.length;
		int col = matrix[0].length;//be cautious matrix may be empty
		
		if (rows == 1) {
			return binarySearch(matrix, 0, 0, col - 1, target);
		}
		
		int rStart = 0;
		int rEnd = rows - 1;
		int cMid = col /2;
		
		//run the loop till two rows are remaining
		while (rStart < ( rEnd - 1 )) {//till its true there are more than two rows
			int mid = rStart + (rEnd - rStart) / 2;
			if (matrix[mid][cMid] == target) {
				return new int[] {mid, cMid};
			}
			if (matrix[mid][cMid] < target) {
				rStart = mid;
			}else {
				rEnd = mid;
			}
		}
		
		//once this loop end we'll have two rows
		//check if target is in the middle column of two rows
		
		if (matrix[rStart][cMid] == target) {
			return new int[] {rStart, cMid};
		}
		if (matrix[rStart + 1][cMid] == target) {
			return new int[] {rEnd, cMid};
		}
		
		//search in the 1st half
		if(target <= matrix[rStart][cMid - 1] ) {
			return binarySearch(matrix, rStart, 0, cMid - 1, target);
		}
		
		//search in the 2nd half
		if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
			return binarySearch(matrix, rStart, cMid + 1, col - 1, target);
		}
	
		//search in the 3rd half
		if(target <= matrix[rStart + 1][cMid - 1]) {
			return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
		}else {
			return binarySearch(matrix, rStart + 1, cMid + 1, col, target);
		}

	}
}

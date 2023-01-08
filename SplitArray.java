//[7,2,5,10,8], k = 2
public class SplitArray {
	public static void main(String args[]) {
		Solution2 s1 = new Solution2();
		int nums[] = {7,2,5,10,8};
		int ans = s1.splitArray(nums, 2);
		System.out.println(ans);
	}
}

class Solution2 {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        // int pieces = 0;
        // int mid = start + (end - start) / 2;
        // int sum = 0;
        
        //Binary search
        while (start < end){
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int sum = 0;
            for (int num: nums){
            if (sum + num > mid){
                sum = num;
                pieces++;
            }else{
                sum += num;
            }
        }
            if (pieces >= k){
            	end = mid;
            }else{
            	start = mid + 1;
            }
        }
        return start;
    }
}
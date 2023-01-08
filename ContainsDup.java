// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class ContainsDup {
    public static void main(String[] args) {
        Solution2 s1 = new Solution2();
        int[] nums = {-1};
//        boolean isDouble= s1.containsDuplicate(nums);
//        System.out.println(isDouble);
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        nums = sort(nums);
        int lastIndex = nums.length - 1;
        for (int i = 0; i <= (lastIndex - (i+1)); i++){
     if (nums[lastIndex - i] == nums[lastIndex - (i+1)]){
         return true;
     }
            if(nums[i] == nums[i + 1])
                return true;    
        }
        return false;
    }

    public int[] sort(int[] nums){
        for (int i = 0; i < nums.length; i++){
         for (int j = i + 1; j < nums.length; j++){
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
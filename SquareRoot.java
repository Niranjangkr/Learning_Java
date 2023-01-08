
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution123 s1 = new Solution123();
		int ans = s1.mySqrt(2147395599);
		System.out.println(ans);
	}
	

}

class Solution123 {
    public int mySqrt(int x) {
       int start = 0;
       int end = x / 2 + 1;
       if (x == 1){
           return x;
       } 
        while(start < end){
            int mid = start + (end - start) / 2;
            if (mid * mid == x){
                return mid;
            }else if(mid * mid < x){
            	start = mid + 1;
            }else{
                end = mid;
            }
        }

        return start - 1;
    }
}
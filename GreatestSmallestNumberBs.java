
public class GreatestSmallestNumberBs {
	public static void main (String[] args) {
		Solution1 s1 = new Solution1();
		char[] ch = {'c', 'f', 'j'};
		System.out.println(s1.nextGreatestLetter(ch, 'd'));
	}
}
class Solution1 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = start + (end - start) / 2;

        while(start <= end){
            if (target == letters[mid]){
                start = mid + 1;
                mid = start + (end - start)/2;
            }else if (target > letters[mid]){
                start = mid + 1;
                mid = start + (end - start)/2;
           }else{
                end = mid - 1;
                mid = start + (end - start)/2;
            }
        }
        return letters[start % letters.length];
    }
}
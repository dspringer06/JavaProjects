package arrayAndString;


//in java Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the 
//start of the string.

public class ReverseKString {
	public static String reverseString(String s, int k) {
		char[] charArray = s.toCharArray();
		int n = charArray.length;
		
		for(int start = 0; start < n; start += 2 * k) {
			int end = Math.min(start + k - 1, n - 1);
			reverse(charArray, start, end);
		}
		
		return new String(charArray);
	}
	
	public static void reverse(char[] array, int left, int right) {
		while(left < right) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String []args, String s, int k) {
		reverseString(s, k);
		s = "abcdefghijk";
		k = 2;
		String result = reverseString(s, k);
		
		System.out.println(result);
	}

}

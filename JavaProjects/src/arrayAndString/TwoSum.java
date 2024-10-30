package arrayAndString;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			int secondNum = target - nums[i];
			
			if(map.containsKey(secondNum)) {
				return new int[] {map.get(secondNum), i};
			}
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two numbers in array equals to the target.");
	}
	
	public static void main(String []args, int target) {
		
		int[] nums = {2,7,11,15};
		target = 19;
		
		int[] result = twoSum(nums, target);
		
		System.out.println(Arrays.toString(result));
	}
}

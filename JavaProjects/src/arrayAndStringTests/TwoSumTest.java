package arrayAndStringTests;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import arrayAndString.TwoSum;

public class TwoSumTest {
	TwoSum twoSum = new TwoSum();
	
	 @Test
	    public void testArrayIndexOutOfBoundsException() {
	        // Arrange
	        int[] testArray = {1, 2, 3}; // An array with 3 elements

	        // Act & Assert
	        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
	            // Trying to access an index that is out of bounds
	            int value = testArray[3]; // This should throw ArrayIndexOutOfBoundsException
	        });
	    }
	
	@Test
	public void testTwoSumEqualTarget() {
		//Arrange
		int[] nums = {1, 2, 3};
		int target = 3;
		int[] result = {0,1};
		String expected = Arrays.toString(result);
		
		//Act
		String actual = Arrays.toString(TwoSum.twoSum(nums, target));
		
		//Assert
		assertEquals(expected, actual);	
	}
	
	 @Test
	    public void testTwoSumNoPairExists() {
	        // Arrange
	        int[] nums = {1, 2, 3, 4};
	        int target = 10;

	        // Act & Assert
	        IllegalArgumentException thrown = assertThrows(
	            IllegalArgumentException.class,
	            () -> TwoSum.twoSum(nums, target)
	        );
	        assertEquals("No two numbers in array equals to the target.", thrown.getMessage());
	    }
	
	   @Test
	    public void testTwoSumWithNegativeNumbers() {
	        // Arrange
	        int[] nums = {-3, 4, 2, 90};
	        int target = -1;

	        // Act
	        int[] result = TwoSum.twoSum(nums, target);

	        // Assert
	        assertArrayEquals(new int[]{0, 2}, result); // Expecting indices of -3 and 3
	    }
	   
	   @Test
	    public void testTwoSumWithZeroTarget() {
	        // Arrange
	        int[] nums = {3, 2, -3, 4};
	        int target = 0;

	        // Act
	        int[] result = TwoSum.twoSum(nums, target);

	        // Assert
	        assertArrayEquals(new int[]{0, 2}, result); // Expecting indices of 3 and -3
	    }
}

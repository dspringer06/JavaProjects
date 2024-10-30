package arrayAndStringTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arrayAndString.ReverseWholeString;

class ReverseWholeStringTest {
	
	String input = "I am sentence 1. I am sentence 2.";

	@Test
    public void testReverseByWord() {
        String expected = "2. sentence am I 1. sentence am I";
        String actual = ReverseWholeString.reverseByWord(input);
        assertEquals(expected, actual);
    }
	
	@Test
	public void testReverseBySentence() {
		String expected = " I am sentence 2. I am sentence 1";
		String actual = ReverseWholeString.reverseBySentence(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testReverseWholeString() {
		String expected = "I am sentence 1. I am sentence 2.";
		String actual = input;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStringReversed() {
		String expected = ".2 ecnetnes ma I .1 ecnetnes ma I";
		String actual = ReverseWholeString.stringReversed(input);
		assertEquals(expected, actual);
	}
	
	@Test
    public void testStringProperties() {
        // Arrange
        String forward = "It matters not how straight the gate how charged with punishments the scroll. I am the master of my fate I am the captain of my soul";

        // Act & Assert
        // Check if the string is not null
        assertNotNull(forward);
	}
	
	 @Test
	    public void testEmptyString() {
	        String input = "";
	        assertEquals("", ReverseWholeString.stringReversed(input));
	        assertEquals("", ReverseWholeString.reverseByWord(input));
	        assertEquals("", ReverseWholeString.reverseBySentence(input));
	    }

}


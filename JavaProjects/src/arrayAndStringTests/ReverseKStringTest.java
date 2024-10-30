package arrayAndStringTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import arrayAndString.ReverseKString;

public class ReverseKStringTest {

    @Test
    public void testReverseStringWithEvenLength() {
        // Arrange
        String input = "abcdefghijk";
        int k = 2;
        String expected = "bacdfeghjik";

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWithOddLength() {
        // Arrange
        String input = "abcdefghij";
        int k = 2;
        String expected = "bacdfeghji";

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWithKGreaterThanLength() {
        // Arrange
        String input = "abc";
        int k = 5;
        String expected = "cba"; // The entire string should be reversed

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWithKEqualToLength() {
        // Arrange
        String input = "abc";
        int k = 3;
        String expected = "cba"; // The entire string should be reversed

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWithEmptyString() {
        // Arrange
        String input = "";
        int k = 2;
        String expected = ""; // An empty string should return empty

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWithSingleCharacter() {
        // Arrange
        String input = "a";
        int k = 1;
        String expected = "a"; // A single character should remain unchanged

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseStringWithKEqualToOne() {
        // Arrange
        String input = "abcdef";
        int k = 1;
        String expected = "abcdef"; // With k=1, the string should remain unchanged

        // Act
        String actual = ReverseKString.reverseString(input, k);

        // Assert
        assertEquals(expected, actual);
    }
}


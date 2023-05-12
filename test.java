import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyFunctionsTest {

    @Test
    void testCalculateFactorial() {
        assertEquals(1, calculateFactorial(0));
        assertEquals(1, calculateFactorial(1));
        assertEquals(120, calculateFactorial(5));
        assertEquals(3628800, calculateFactorial(10));
        assertThrows(IllegalArgumentException.class, () -> calculateFactorial(-1));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(isPalindrome("racecar"));
        assertTrue(isPalindrome("level"));
        assertFalse(isPalindrome("hello"));
        assertFalse(isPalindrome("world"));
        assertThrows(IllegalArgumentException.class, () -> isPalindrome(""));
    }

    private int calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
    
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
    
        return factorial;
    }

    private boolean isPalindrome(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("Input word cannot be empty.");
        }
    
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
    
        return true;
    }
}

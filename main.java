public class MyFunctions {
    
    public static int calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
    
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
    
        int result = factorial;  // Store the factorial in a variable
    
        return result;
    }

    public static boolean isPalindrome(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("Input word cannot be empty.");
        }
    
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                boolean isPalindrome = false;  // Store the result in a variable
                return isPalindrome;
            }
        }
    
        boolean isPalindrome = true;  // Store the result in a variable
    
        return isPalindrome;
    }

    public static void main(String[] args) {
        // Example usage
        int factorial = calculateFactorial(5);
        System.out.println("Factorial of 5: " + factorial);
    
        boolean palindrome = isPalindrome("level");
        System.out.println("Is 'level' a palindrome? " + palindrome);
    }
}

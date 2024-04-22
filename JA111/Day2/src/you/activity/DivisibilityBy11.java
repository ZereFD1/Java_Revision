package you.activity;
import java.util.Scanner;

public class DivisibilityBy11 {
    
    // Function to check if a number is divisible by 11 using the given method
    public static boolean isDivisibleBy11(int number) {
        // Convert the number to a string for easier manipulation
        String numString = String.valueOf(number);
        int sum1 = 0, sum2 = 0;
        
        // Iterate through the digits, starting from the leftmost digit
        for (int i = 0; i < numString.length(); i++) {
            // Convert character to integer by subtracting '0'
            int digit = numString.charAt(i) - '0';
            
            // Add the digit to the appropriate sum based on its position
            if (i % 2 == 0) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
        }
        
        // Calculate the difference between the two sums
        int difference = (sum1 > sum2) ? (sum1 - sum2) : (sum2 - sum1);
        
        // Check if the difference is divisible by 11
        return difference == 0 || difference % 11 == 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check divisibility by 11: ");
        int number = scanner.nextInt();
        
        if (isDivisibleBy11(number)) {
            System.out.println(number + " is divisible by 11.");
        } else {
            System.out.println(number + " is not divisible by 11.");
        }
        
        scanner.close();
    }
}


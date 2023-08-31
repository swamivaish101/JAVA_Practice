import java.util.*;

public class ReverseAndSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        //Here Calculate the reverse of the number and the sum of its digits
        int reverse = 0;
        int sumOfDigits = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            sumOfDigits += digit;
            number /= 10;
        }
        
        System.out.println("Reverse of the number: " + reverse);
        System.out.println("Sum of the digits: " + sumOfDigits);
        
        
    }
}

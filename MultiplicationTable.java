import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Generate and print the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        
    
    }
}

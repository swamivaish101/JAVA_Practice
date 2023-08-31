import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] vaish) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        // Convert decimal to binary
        String binary = "";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary = remainder + binary; // Append the remainder to the front of the binary string
            decimalNumber = decimalNumber / 2;
        }

        
        System.out.println("Binary representation: " + binary);

        
    }
}

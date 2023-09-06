import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the length of the array
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();

        // Create an array of the specified length
        int[] arr = new int[length];

        // Accept values from the user to fill the array
        System.out.println("Enter the values for the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = input.nextInt();
        }

        // Ask the user for the value to search for
        System.out.print("Enter the value to search for: ");
        int target = input.nextInt();

        // Perform linear search
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                index = i;
                break; // Value found, no need to continue searching
            }
        }

        // Display the result
        if (index != -1) {
            System.out.println("The value " + target + " is found at index " + index);
        } else {
            System.out.println("The value " + target + " is not found in the array.");
        }

      
    }
}

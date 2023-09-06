import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayListExample {
    public static void main(String[] vaish) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> originalList = new ArrayList<>();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            originalList.add(element);
        }

        List<Integer> reversedList = new ArrayList<>();

        
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        
        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);

    
    }
}

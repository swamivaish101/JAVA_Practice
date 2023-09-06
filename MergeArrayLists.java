
import java.util.*;

public class MergeArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create ArrayLists for first names and last names
        List<String> firstNames1 = new ArrayList<>();
    
        List<String> lastNames1 = new ArrayList<>();
       

        // Take runtime input for first names
        System.out.println("Enter first 3 names for list :");
        for (int i = 0; i < 3; i++) { // You can change the number of names as needed
            String firstName = sc.next();
            firstNames1.add(firstName);
        }

        // Take runtime input for last names
        System.out.println("Enter last 3 names for list :");
        for (int i = 0; i < 3; i++) { // You can change the number of names as needed
            String lastName = sc.next();
            lastNames1.add(lastName);
        }

        
        // Merge the first names and last names into a third ArrayList
        List<String> fullNames = new ArrayList<>();
        for (int i = 0; i < 3; i++) { // Assuming you have 3 names in each list
            fullNames.add(firstNames1.get(i) + " " + lastNames1.get(i));
            
        }

        // Display the merged list
        System.out.println("Merged List:");
        for (String fullName : fullNames) {
            System.out.println(fullName);
        }

    }
}

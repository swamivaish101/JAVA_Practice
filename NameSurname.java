import java.util.*;

public class NameSurname {
    public static void main(String[] args) {
        // Here i created array for  first name 
        List<String> firstNames = new ArrayList<>();
        firstNames.add("Vaishnavi");
        firstNames.add("Khushi");
        firstNames.add("Govind");

    

        // Here i created array for  last name
        List<String> lastNames = new ArrayList<>();
        lastNames.add("Swami");
        lastNames.add("Vaishnav");
        lastNames.add("Kabra");

       

        // Merge the first names and last names into a third ArrayList
        List<String> fullNames = new ArrayList<>();
        for (int i = 0; i < firstNames.size(); i++) {
            fullNames.add(firstNames.get(i) + " " + lastNames.get(i));
            
        }

    // Display the merged list in ArrayList 3
        for (String fullName : fullNames) 
        {
            System.out.println(fullName);
        }
    }
}

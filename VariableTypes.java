public class VariableTypes{
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 30;  // Integer
        double salary = 50000.50;  // Double
        char grade = 'A';  // Character
        boolean isStudent = true;  // Boolean

        // Reference Data Types
        String name = "John";  // String
        int[] numbers = {1, 2, 3, 4, 5};  // Array of integers

        // Display values
        System.out.println("Primitive Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        System.out.println("\nReference Data Types:");
        System.out.println("Name: " + name);

        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

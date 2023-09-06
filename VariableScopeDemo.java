public class VariableScopeDemo {
    // This is a class-level (static) variable
    static int classLevelVariable = 100;

    public static void main(String[] args) {
        // This is a method-level (local) variable
        int methodLevelVariable = 50;

        System.out.println("Class-level Variable: " + classLevelVariable);
        System.out.println("Method-level Variable: " + methodLevelVariable);

        // Calling a method to demonstrate variable scope within methods
        methodScopeDemo();
    }

    public static void methodScopeDemo() {
        // This is a method-level (local) variable within another method
        int anotherMethodVariable = 25;

        System.out.println("Class-level Variable (inside method): " + classLevelVariable);

        // This will result in a compilation error because methodLevelVariable is not in scope here
        // System.out.println("Method-level Variable (inside another method): " + methodLevelVariable);

        System.out.println("Another Method-level Variable: " + anotherMethodVariable);
    }
}

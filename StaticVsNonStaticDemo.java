public class StaticVsNonStaticDemo {

    // Static variable shared among all instances
    static int staticCount = 0;

    // Non-static (instance) variable specific to each instance
    int nonStaticCount = 0;

    // Static method
    static void incrementStaticCount() {
        staticCount++;
    }

    // Non-static method
    void incrementNonStaticCount() {
        nonStaticCount++;
    }

    public static void main(String[] args) {
        // Create instances of the class
        StaticVsNonStaticDemo obj1 = new StaticVsNonStaticDemo();
        StaticVsNonStaticDemo obj2 = new StaticVsNonStaticDemo();

        // Access and modify static variables and call static method
        obj1.staticCount++; // Not recommended, but possible
        obj2.incrementStaticCount(); // Better practice
        System.out.println("Static Count (obj1): " + obj1.staticCount);
        System.out.println("Static Count (obj2): " + obj2.staticCount);

        // Access and modify non-static (instance) variables and call non-static method
        obj1.nonStaticCount++;
        obj2.incrementNonStaticCount();
        System.out.println("Non-Static Count (obj1): " + obj1.nonStaticCount);
        System.out.println("Non-Static Count (obj2): " + obj2.nonStaticCount);
    }
}

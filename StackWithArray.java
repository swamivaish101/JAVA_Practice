import java.util.Scanner;

public class StackWithArray 
{
     int maxSize;
     int[] stackArray;
     int top;

    public StackWithArray(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
       
    public void push(int value) 
    {
        if (top < maxSize - 1) 
        {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push.");
        }
    }

    public void pop()
     {
        if (top >= 0) 
        {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
        } else 
        {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }
    public void displayStack() 
    {
        if (top >= 0) 
        {
            System.out.println("Stack contents are:");
            for (int i = top; i >= 0; i--) 
            {
                System.out.println(stackArray[i]);
            }
        } else 
        {
            System.out.println("Stack is empty.");
        }
    }

    public static void main(String[] vaish) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int stackSize = input.nextInt();

        StackWithArray stack = new StackWithArray(stackSize);

        while (true) {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push: ");
                    int valueToPush = input.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.displayStack(); 
                    break;    
                case 4:
                    System.out.println("Exiting the program.");
            
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
 //Write a Java program to print the sum (addition), multiply, subtract, divide, and remainder of two numbers.

 public class Arithmitec{
 
 public static void main(String[] args) {
  int num1=10;
  int num2=20;
   
 
  System.out.println(num1 + " + " + num2 + " = " + //Addition 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " +  //Substraction
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + //Multiplication
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " +  //Division
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + //Modules
  (num1 % num2));
 }
 
}
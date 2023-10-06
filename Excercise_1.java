import java.util.Scanner;

public class Excercise_1{
   public static void main(String[] args){
      
      int num1, num2, sum, difference, product,maxInt, minInt;
      double average;
      
      Scanner integers = new Scanner(System.in);//Create a scanner object
      
      System.out.print("Enter First Integer: ");//Input First Integer
      num1 = integers.nextInt(); //Read user input
      
      System.out.print("Enter Second Integer: ");//Input Second Integer
      num2 = integers.nextInt(); //Read user input
      
      sum = num1 + num2;
      difference = num1 - num2;
      product = num1 * num2;
      average = sum / 2;
      
      if (num1 > num2){
            maxInt = num1;
            minInt = num2;
        } 
      else{
            maxInt = num2;
            minInt = num1;
        }
      
      System.out.println("\nSum of two integers: "+sum); //The sum of two integers
      System.out.println("Difference of two integers: "+difference); //The difference of two integers
      System.out.println("Product of two integers: "+product); //The product of two integers
      System.out.println("Average of two integers: "+average); //The average of two integers
      System.out.println("Max integer: "+maxInt); //The maxInt of two integers
      System.out.println("Min integer: "+minInt); //The minInt of two integers
      
   }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<>();
        
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            myArray.add(input);
        }
        System.out.println("You entered the following integers: " + myArray);
        // Sort the ArrayList
        myArray.sort(null);  // This sorts the ArrayList in ascending order
        
        // Display the first 5 integers entered
        System.out.println("The following sorted array: " + myArray);
    }
}

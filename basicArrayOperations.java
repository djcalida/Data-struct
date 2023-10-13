import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<>();

        System.out.println("Enter 5 integers: ");
        
        //Scan the first 5 integers inputs 
        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            myArray.add(input);
        }
        //Dislplay the first 5 integers entered
        System.out.println("You entered the following integers: " + myArray);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert an element at the beginning");
            System.out.println("2. Insert an element at the end");
            System.out.println("3. Delete an element from a specific position");
            System.out.println("4. Search for an element and return its index");
            System.out.println("5. Update an element at a specific position");
            System.out.println("6. Print the array");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int firstElement = scanner.nextInt();
                    myArray.add(0, firstElement); //Enable to insert a new number in the beginning of array lists because of the add() method...
                    break;
                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int lastElement = scanner.nextInt();
                    myArray.add(lastElement); //Enable to insert a new number in the very last of array lists because of the add() method...
                    break;
                case 3:
                    System.out.print("Enter the position to delete an element: ");
                    int positionToDelete = scanner.nextInt();
                    if (positionToDelete >= 0 && positionToDelete < myArray.size()) {//size() method
                        myArray.remove(positionToDelete); //Enable to remove or delete a new number in the array lists because of the remove() method...
                    } else {
                        System.out.println("\nInvalid position.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the element to search for: ");
                    int elementToSearch = scanner.nextInt();
                    int indexOfElement = myArray.indexOf(elementToSearch); //Enable to search what is the assigned number in the index or the list of the array, because of the indexOf() method...
                    if (indexOfElement != -1) {
                        System.out.println("The element " + elementToSearch + " is at index " + indexOfElement);
                    } else {
                        System.out.println("The element " + elementToSearch + " is not in the array");
                    }
                    break;
                case 5:
                    System.out.print("Enter the position to update: ");
                    int positionToUpdate = scanner.nextInt();
                    if (positionToUpdate >= 0 && positionToUpdate < myArray.size()) {
                        System.out.print("Enter the new value: ");
                        int newElementValue = scanner.nextInt();
                        myArray.set(positionToUpdate, newElementValue); // Enable to update a number in the index because of the set() method...
                    } else {
                        System.out.println("Invalid position. Update failed.");
                    }
                    break;
                case 6:
                    System.out.println("\nFinal Array: " + myArray); //print the lists of array being updated...
                    break;
                case 7:
                    System.out.println("Exiting"); // exit the program....
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\nPick a number from 1-7.");
            }
        }
    }
}

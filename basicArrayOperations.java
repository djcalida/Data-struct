import java.util.ArrayList;
import java.util.Scanner;

public class basicArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<>();

        while (true) {
            System.out.println("\nChoose an element:");
            System.out.println("1. Insert an element at the beginning");
            System.out.println("2. Insert an element at the end");
            System.out.println("3. Delete an element from a specific position");
            System.out.println("4. Search for an element and return its index");
            System.out.println("5. Update an element at a specific position");
            System.out.println("6. Print the array");
            System.out.println("7. Exit");

            System.out.print("/nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int firstElement = scanner.nextInt();
                    myArray.add(0, firstElement);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int lastElement = scanner.nextInt();
                    myArray.add(lastElement);
                    break;
                case 3:
                    System.out.print("Enter the position to delete an element: ");
                    int positionToDelete = scanner.nextInt();
                    if (positionToDelete >= 0 && positionToDelete < myArray.size()) {
                        myArray.remove(positionToDelete);
                    } else {
                        System.out.println("\nSobra rasad.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the element to search for: ");
                    int elementToSearch = scanner.nextInt();
                    int indexOfElement = myArray.indexOf(elementToSearch);
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
                        myArray.set(positionToUpdate, newElementValue);
                    } else {
                        System.out.println("Invalid position. Update failed.");
                    }
                    break;
                case 6:
                    System.out.println("\nArrays: " + myArray);
                    break;
                case 7:
                    System.out.println("Humana");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\n\nPick a number from 1-7.");
            }
        }
    }
}
import java.util.Scanner;

public class CalculatorWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease select an option");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Average");
            System.out.println("6. Exit\n");

            int option = scanner.nextInt();

            if (option == 6) {
                System.out.println("\nExiting Program....");
                break;
            }
            if(option <1 || option >6){
                System.out.println("\nInvalid option. Please choose a valid option. Exiting program....");
                break;
            }

            System.out.print("Enter First Integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Integer: ");
            int num2 = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n***ADDITION***");
                    System.out.println("Sum of two integers: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("\n***SUBTRACTION***");
                    System.out.println("Difference of two integers: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("\n***MULTIPLICATION***");
                    System.out.println("Product of two integers: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("\n***DIVISION***");
                        System.out.println("Quotient of two integers: " + ((float) num1 / num2));
                    } else {
                        System.out.println("\nZero is not divisible.");
                    }
                    break;
                case 5:
                    System.out.println("\n***AVERAGE***");
                    System.out.println("Average of two integers: " + ((double)(num1 + num2)/2));
                    break;
                
            }
        }

        scanner.close();
    }
}

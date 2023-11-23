import java.util.ArrayList;
import java.util.Scanner;

public class DsaQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> queue = new ArrayList<>();
        ArrayList<String> history = new ArrayList<>(); // Track history of enqueued elements, dequeued elements, and queue operations

        System.out.println("Enter elements to enqueue (enter -1 to stop):");
        int element;
        while ((element = scanner.nextInt()) != -1) {
            queue.add(element);
            history.add("Enqueued: " + element);
        }

        history.add("Queue size: " + queue.size());

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an operation: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Check if the queue is empty");
            System.out.println("4. Get size of the queue");
            System.out.println("5. Display history of operations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int enqElement = scanner.nextInt();
                    queue.add(enqElement);
                    history.add("Enqueued: " + enqElement);
                    System.out.println("Element enqueued: " + enqElement);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int dequeued = queue.remove(0);
                        history.add("Dequeued: " + dequeued);
                        System.out.println("Dequeued element: " + dequeued);
                    } else {
                        history.add("Queue is empty. Cannot dequeue.");
                        System.out.println("Queue is empty. Cannot dequeue.");
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        history.add("Queue is empty.");
                        System.out.println("Queue is empty.");
                    } else {
                        history.add("Queue is not empty.");
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 4:
                    history.add("Size of queue: " + queue.size());
                    System.out.println("Size of queue: " + queue.size());
                    break;
                case 5:
                    System.out.println("\nHistory of operations:");
                    for (String event : history) {
                        System.out.println(event);
                    }
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}

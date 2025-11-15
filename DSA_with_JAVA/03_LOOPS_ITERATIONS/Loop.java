public class Loop {

    public static void main(String[] args) {

        System.out.println("=== FOR LOOP EXAMPLE ===");
        // Use Case: Known number of iterations
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Count: " + i);
        }


        System.out.println("\n=== FOR-EACH LOOP EXAMPLE ===");
        // Use Case: Arrays or collections
        String[] fruits = {"Apple", "Mango", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }


        System.out.println("\n=== WHILE LOOP EXAMPLE ===");
        // Use Case: When number of iterations is unknown (condition-based)
        int number = 1;
        while (number <= 5) {
            System.out.println("While Loop Value: " + number);
            number++;
        }


        System.out.println("\n=== DO-WHILE LOOP EXAMPLE ===");
        // Use Case: Execute at least once (condition checked later)
        int x = 1;
        do {
            System.out.println("Do-While Value: " + x);
            x++;
        } while (x <= 5);

    }
}

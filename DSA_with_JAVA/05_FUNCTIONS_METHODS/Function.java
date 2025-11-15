public class Function {

    // 1. Function with no return type & no parameters
    static void greet() {
        System.out.println("Hello! This is a function with no parameters and no return type.");
    }

    // 2. Function with parameters but no return type
    static void displaySum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 3. Function with return type but no parameters
    static int getRandomNumber() {
        return 42;  // Example value
    }

    // 4. Function with return type and parameters
    static int multiply(int x, int y) {
        return x * y;
    }

    // 5. Function Overloading (same name, different parameters)
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("=== 1. No Return Type & No Parameters ===");
        greet();

        System.out.println("\n=== 2. Parameters but No Return Type ===");
        displaySum(10, 20);

        System.out.println("\n=== 3. Return Type but No Parameters ===");
        int random = getRandomNumber();
        System.out.println("Random Number: " + random);

        System.out.println("\n=== 4. Return Type & Parameters ===");
        int result = multiply(5, 4);
        System.out.println("Multiplication Result: " + result);

        System.out.println("\n=== 5. Function Overloading ===");
        System.out.println("Add (2 numbers): " + add(5, 10));
        System.out.println("Add (3 numbers): " + add(5, 10, 15));
    }
}

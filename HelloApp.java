public class HelloApp {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length > 0) {
            // Enhanced for loop to greet each argument
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            // Default greeting when no arguments are given
            System.out.println("Hello, World!");
        }
    }
}
/**
 * HelloApp.java
 *
 * UC1 : Display "Hello World"
 * UC2 : Accept a user's name using command-line argument
 * UC3 : Provide default greeting if no name is provided
 * UC4 : Display greeting for multiple command-line arguments
 *
 * Usage:
 * java HelloApp Alice Bob Charlie
 *
 * Output:
 * Hello, Alice, Bob, Charlie!
 *
 * @author Karunakaran R
 * @version 4.0
 * @since UC1
 */

/**
 * Key Concepts:
 * 1. Array Handling – Processing multiple command-line arguments
 * 2. For Loop – Iterating through args array
 * 3. StringBuilder – Efficient string construction
 * 4. String Concatenation – Building final greeting message
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default greeting when no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build the greeting message
        StringBuilder names = new StringBuilder();

        // Loop through all command-line arguments
        for (int i = 0; i < args.length; i++) {

            names.append(args[i]);

            // Add comma between names except the last one
            if (i < args.length - 1) {
                names.append(", ");
            }
        }

        // Print final greeting
        System.out.println("Hello, " + names.toString() + "!");
    }
}
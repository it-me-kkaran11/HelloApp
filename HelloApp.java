/**
 * HelloApp.java
 *
 * UC1 : Display "Hello World" to the console
 * UC2 : Accept a user's name as a command-line argument
 * UC3 : Display a default greeting if no name is provided
 *
 * Usage:
 * java HelloApp [name]
 *
 * If a name is provided  -> Hello, Name!
 * If no name is provided -> Hello, World!
 *
 * @author Karunakaran R
 * @version 3.0
 * @since UC1
 */

/**
 * Key Concepts:
 * 1. Default Values: Providing a fallback value when no input is given
 * 2. Command-Line Arguments: Accessing user input via args[] parameter
 * 3. Conditional Statements: Using if conditions
 * 4. Boolean Logic: Controlling program flow
 * 5. Array Length: Checking number of command-line arguments
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name if no argument is provided
        String name = "World";

        // Check if the user has provided a command-line argument
        if (args.length > 0) {

            // Use the first argument as the name
            name = args[0];
        }

        // Display greeting message
        System.out.println("Hello, " + name + "!");
    }
}
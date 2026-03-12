/**
 * HelloApp.java – UC2: Display "Hello" using Command-Line Argument
 *
 * This program demonstrates how to accept input from the command line
 * and use it in a Java program. The program reads the first argument
 * passed when executing the program and prints a greeting message
 * using that name.
 *
 * Example:
 * Input:  java HelloApp Alice
 * Output: Hello, Alice!
 *
 * @author Karunakaran R
 * @version 1.0
 * @since UC2
 */

/**
 * Key Concepts of UC2:
 * 1. Command-Line Arguments: Accessing user input via args[] parameter
 * 2. String Concatenation: Combining strings using the + operator
 * 3. System.out.println(): Output to console
 * 4. Array Indexing: Accessing the first argument with args[0]
 */

public class HelloApp {

    public static void main(String[] args) {

        // Retrieve the first command-line argument (user name)
        String name = args[0];

        // Print greeting message with the provided name
        System.out.println("Hello, " + name + "!");

    }
}
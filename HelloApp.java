public class HelloArguments {
    public static void main(String[] args) {
        // If no arguments are passed, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder greeting = new StringBuilder("Hello, ");
            
            // Enhanced for loop to append each argument with a comma
            for (String name : args) {
                greeting.append(name).append(", ");
            }
            
            // Remove the trailing comma and space using substring
            String finalGreeting = greeting.substring(0, greeting.length() - 2);
            
            System.out.println(finalGreeting);
        }
    }
}
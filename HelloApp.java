public class HelloArgumentsJoin {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder greeting = new StringBuilder("Hello, ");
            // Enhanced for loop to append each argument with a comma
            for (String name : args) {
                greeting.append(name).append(", ");
            }
            
            // Remove the comma & space using substring
            String finalGreeting = greeting.substring(0, greeting.length() - 2);
            
            System.out.println(finalGreeting);

        }
    }
}
package HW.e1.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);

        // Prompt the user to input a browser name
        System.out.println("Please enter a browser name:");
        String input= scanner.nextLine();

        // Read the input string
        if(input.equalsIgnoreCase("Chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (input.equalsIgnoreCase("Firefox")) {
            System.out.println("Proceed with Firefox browser");

        } else if (input.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");

        }else{
            System.out.println("Invalid browser");
        }


        // Use conditional statements to print the message based on the input
        // If the input is "Chrome", "chrome", "CHROME", or "ChRoMe", print "Proceed with Chrome browser"
        // If the input is "firefox", "FIREFOX", or "FireFOX", print "Proceed with Firefox browser"
        // If the input is "IE", "ie", or "iE", print "Proceed with IE browser"
        // For any other input, print "Invalid browser"
    }
}

package HW.e1.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        // Prompt the user to input a string value
        System.out.println("Please enter a string:");

        // Read the input string
        String input=scanner.nextLine();
        String str=input.substring(0,3);
        System.out.println("The first 3 letters of "+  input + " is " + str);



        // Extract the first 3 letters using the substring() method

        // Print the result in the specified format
    }
}

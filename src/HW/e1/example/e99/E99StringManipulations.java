package HW.e1.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");
        String input= scanner.nextLine();

        // Read the input string
        input=input.replace(" ","").toLowerCase();
        StringBuilder words=new StringBuilder(input);

        words=words.reverse();

        String toCompare= words.toString();

        if (input.equals(toCompare)){
            System.out.println("True");

        }else{
            System.out.println("False");
        }



























        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise
    }
}

package HW.e1.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.print("In: ");
        String s = inp.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a');
            System.out.print(s.charAt(i)+" ");

        }
        
        // Use a for loop to iterate through the string and print each character separated by spaces on the same line
        // (Your code goes here)
    }
}

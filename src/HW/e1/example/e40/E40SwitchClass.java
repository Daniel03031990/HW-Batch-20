package HW.e1.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input
        System.out.println("Enter name of the instructor");

        String instructorName=scanner.nextLine();

        String responsibility;
switch (instructorName) {
    case "Asghar":
    System.out.println("Will take care of Java Assignment");
break;
    case "Moazzam":
    System.out.println("Will take care of SDLC Assignment");
break;
    case "Weqas":
    System.out.println("Will take care of Selenium Assignment");
break;
    case "Asel":
    System.out.println("Will take care of every Assignment");
    break;
    default:
    System.out.println("Invalid instructor selected");
}
        // Determine the responsibility based on the instructor's name using a switch statement
        // If the name is "Asghar"
        //    Set responsibility to "Will take care of Java Assignment"
        // If the name is "Moazzam"
        //    Set responsibility to "Will take care of SDLC Assignment"
        // If the name is "Weqas"
        //    Set responsibility to "Will take care of Selenium Assignment"
        // If the name is "Asel"
        //    Set responsibility to "Will take care of every Assignment"
        // For any other name
        //    Set responsibility to "Invalid instructor selected"

        // Print the responsibility
    }
}

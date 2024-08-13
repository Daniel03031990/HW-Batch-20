package HW.e1.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner imput=new Scanner(System.in);
        // Print prompt for user to enter the time of day
        // Capture the time of day input

        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        String timeOfDay=imput.nextLine();



        switch (timeOfDay){
            case "morning":
                System.out.println("Recommended meal: Breakfast");
                break;
            case "afternoon":
                System.out.println("Recommended meal: Lunch");
                break;
            case "evening":
                System.out.println("Recommended meal: Dinner");
                break;
            case "night":
                System.out.println("Recommended meal: Snack");
                break;
            default:
                System.out.println("Invalid time of day entered");
        }
        // Recommend meal using switch statement
        // Case "morning"
        //    Print "Recommended meal: Breakfast"
        // Case "afternoon"
        //    Print "Recommended meal: Lunch"
        // Case "evening"
        //    Print "Recommended meal: Dinner"
        // Case "night"
        //    Print "Recommended meal: Snack"
        // Default
        //    Print "Invalid time of day entered"
    }
}

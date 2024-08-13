package HW.e1.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        // Capture the meal type input
        int mealType = input.nextInt();
        float result=0f;
        System.out.println(mealType);
        switch (mealType) {
            case 1:
                result = 5.0f;
                break;
            case 2:
                result = 10.0f;
                break;
            case 3:
                result = 15.0f;
                break;
            default:
                System.out.println("Invalid meal type entered");
                break;
        }if(result>4){

        System.out.println("The price of your meal is $" + result);

        // Calculate price using switch statement
        // Case 1
        //    Set price to $5.00
        // Case 2
        //    Set price to $10.00
        // Case 3
        //    Set price to $15.00
        // Default
        //    Print "Invalid meal type entered"

        // Print the price
        // Output: The price of your meal is $____
    }
}}

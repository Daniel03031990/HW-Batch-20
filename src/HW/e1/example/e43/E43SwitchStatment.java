package HW.e1.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your electricity usage in kWh");
        int usage = input.nextInt();
        float bill=0f;

        if(usage<=0){
            System.out.println("Invalid usage entered");
        }else{switch (usage /100) {
            case 0:
                bill = usage * 0.12f;
                break;
            case 1:
                bill = usage * 0.15f;
                break;
            case 2:
                bill = usage * 0.20f;
                break;
            default:
                if (usage >= 301) {
                    bill = usage * 0.25f;
                } else {
                    System.out.println("Invalid usage entered");
                }
        }
                System.out.printf("Your electricity bill is $%.1f%n", bill);


    }

    }






    }
                    // Print prompt for user to enter their electricity usage in kWh
                    // Capture the usage input

                    // Calculate bill using switch statement
                    // Case 0-100
                    //    Multiply usage by $0.12 per kWh
                    // Case 101-200
                    //    Multiply usage by $0.15 per kWh
                    // Case 201-300
                    //    Multiply usage by $0.20 per kWh
                    // Case 301 and above
                    //    Multiply usage by $0.25 per kWh
                    // Default
                    //    Print "Invalid usage entered"

                    // Print the bill
                    // Output: Your electricity bill is $____


package HW.e1.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        int num1 =input.nextInt();
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        int num2 =input.nextInt();
        int num3 =input.nextInt();
        // Use nested if-else statements to find the largest number
        int largest;


        if(num1>=num2 && num2>=num3){
            largest =num1;

        }else if(num2>=num1 && num1>=num3){
            largest=num2;
        }else{
            largest=num3;}
        System.out.println("The largest number is " + largest);







        }

    }


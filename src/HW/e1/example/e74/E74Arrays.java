package HW.e1.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        int[] number=new int[5];

        for (int i = 0; i < number.length; i++) {
            number[i]=scanner.nextInt();


        }
        for (int i = 0; i <= 4; i++) {

            System.out.println(number[i]*10);

        }


        }




        // Create an array of integers with a size of 5


        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)

        // Use another loop to multiply each element of the array by 10 and print the result

    }


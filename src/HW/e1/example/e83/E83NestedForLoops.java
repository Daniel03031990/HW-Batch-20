package HW.e1.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 10; j++) {
                table[i-1][j-1]=i*j;}
        }

            for (int j = 0; j < table.length; j++) {
                for (int k = 0; k < table[j].length; k++) {
                    System.out.print(table[j][k] + " ");


                }
                System.out.println();

            }

        }


        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern

    }


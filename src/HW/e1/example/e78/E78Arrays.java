package HW.e1.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int result= 0;
        for (int raw = 0; raw< a.length; raw++) {
            for (int  col = 0; col < a[raw].length; col++) {
                result+=a[raw][col];

            }
        }
        System.out.println(result);
        // Use nested loops to iterate through the 2D array and calculate the sum of all elements

        // Print the calculated sum
    }
}

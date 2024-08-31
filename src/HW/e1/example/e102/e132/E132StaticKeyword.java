package HW.e1.example.e102.e132;

public class E132StaticKeyword {
        public static int[][] reduce10(int[][] nums) {
            // Create a new 2D array to store the modified values
            int[][] result = new int[nums.length][nums[0].length];

            // Iterate over each element of the 2D array
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    // Subtract 10 from each element and store it in the result array
                    result[i][j] = nums[i][j] - 10;
                }
            }
            return result; // Return the new 2D array
        }

        // Method to print the 2D array in the required format
        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    // Print each element followed by a space
                    System.out.print(array[i][j] + " ");
                }
                // Move to the next line after each row
                System.out.println();
            }
        }

        public static void main(String[] args) {
            // Input 2D array
            int[][] nums = {
                    {1, 2, 3, 4},
                    {4, 5, 6, 7},
                    {1, 3, 5, 7}
            };

            // Call reduce10 method to get the modified array
            int[][] reducedNums = reduce10(nums);

            // Print the modified array
            printArray(reducedNums);
        }
    }




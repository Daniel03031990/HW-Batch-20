package HW.e1.example.e77;

public class E77Arrays {
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] numbers = {5, 4, 8};
        int maxNumber=numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]>maxNumber){
                maxNumber=numbers[i];

            }


        }
        System.out.println(maxNumber);



}
    }
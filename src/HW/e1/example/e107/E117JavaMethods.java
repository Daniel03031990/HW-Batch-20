package HW.e1.example.e107;

public class E117JavaMethods {
    public static void main(String[] args) {
        E117JavaMethods sum=new E117JavaMethods();

        int sumPrint=sum.sumEvenToX(5);
        System.out.println(sumPrint);
        sumPrint=sum.sumEvenToX(8);
        System.out.println(sumPrint);





        // Call the sumEvenToX method with various arguments to test the method
    }
    public static int sumEvenToX(int x){
        int sum=0;
        for (int i = 2; i <= x; i+=2) {
            sum+=i;
        }
        return sum;
    }

    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum
}

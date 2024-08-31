package HW.e1.example.e102.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        E116JavaMethods m=new E116JavaMethods();
        m.bothEven(12,3);
        // Call the bothEven method with various arguments to test the method
    }

    void bothEven(int a,int b){
        if(a % 1==0 && b %2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}

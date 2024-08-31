package HW.e1.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        E114JavaMethods m=new E114JavaMethods();

        m.add(15,15);
        m.multiply(15,2);
        m.subtract(30,10);
        // Call the add method with arguments that add up to 30


        // Call the multiply method with arguments that multiply to 30

        // Call the subtract method with arguments that subtract to 20

    }
    void multiply(int num1,int num2){
        int result;
        result=num1*num2;
        System.out.println("Multiplication " + result);

    }
    void add(int n1,int n2){
        int result;
        result=n1+n2;
        System.out.println("Addition " + result);

    }

    void subtract(int sub1,int sub2){
        int result;
        result=sub1-sub2;
        System.out.println("Subtraction " + result);

    }

    // Create method multiply with two integer parameters and a print statement to display the result

    // Create method add with two integer parameters and a print statement to display the result

    // Create method subtract with two integer parameters and a print statement to display the result

}

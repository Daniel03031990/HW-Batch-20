package HW.e1.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        E121Variables instance=new E121Variables();
        E121Variables instance1=new E121Variables();
        instance.intValue=10;
        instance.doubleValue =10.23;
        instance.charValue ='a';

        System.out.println(instance.intValue);
        System.out.println(instance.doubleValue);
        System.out.println(instance.charValue);

        instance1.intValue=100;
        instance1.doubleValue =100.23;
        instance1.charValue ='s';

        System.out.println(instance1.intValue);
        System.out.println(instance1.doubleValue);
        System.out.println(instance1.charValue);

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}

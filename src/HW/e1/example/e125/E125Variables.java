package HW.e1.example.e125;

public class E125Variables {
    // Declare a static variable at the class level to hold an integer value

    static int number;

    public static void main(String[] args) {
        // Access the static variable in the main method and assign a value to it
        number=200;
        // Create an object of the class
        E125Variables a=new E125Variables();
        a.number=200;

        System.out.println(E125Variables.number);
        // Access the static variable in a non-static way using the object and assign a value of 200

        // Print the static variable using the class name
        System.out.println(a.number);

        // Print the static variable using the object instance
    }
}

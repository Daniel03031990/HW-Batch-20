package HW.e1.example.e107;

public class E115JavaMethods {
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result

        E115JavaMethods m=new E115JavaMethods();

        m.convertToUpper("test");
    }


    void convertToUpper(String word){
        String result;
        System.out.println(word.toUpperCase());
    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}

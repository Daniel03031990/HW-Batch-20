package HW.e1.example.e102.e127;

public class E127StaticKeyword {
    public void nonStaticMethod(){
        System.out.println("Programming is amazing.");
    }
    public static void staticMethod(){
        System.out.println("Java is awesome.");
    }

    // Non-static method that prints a message
    // Static method that prints a message

    // Main method to execute both methods
    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
        E127StaticKeyword obj=new E127StaticKeyword();


        obj.nonStaticMethod();

        E127StaticKeyword.staticMethod();




          // Call non-static method

        // Call the static method directly using the class name
         // Call static method
    }
}

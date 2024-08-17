package HW.e1.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate an object of the StringBuffer class
        StringBuffer a=new StringBuffer();
        a=a.append("Hello ").append("World");

        String sb= a.toString();

        System.out.println(sb.toUpperCase());



        // Append the value "Hello" to the StringBuffer

        // Append the value "World" to the StringBuffer

        // Convert the StringBuffer content to uppercase and print it

    }
}

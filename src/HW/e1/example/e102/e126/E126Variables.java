package HW.e1.example.e102.e126;

import org.example.e123.E123Variables;

public class E126Variables {
    // Declare a static variable at the class level to hold the count of all instances of the class
    static int instanceCount = 0;
    public E126Variables(){
        instanceCount++;

    }








    // Constructor to increment the count


    public static void main(String[] args) {
        E126Variables first=new E126Variables();
        E126Variables second=new E126Variables();
        E126Variables third=new E126Variables();

        System.out.println(E126Variables.instanceCount);




        // Create 3 objects of the class


        // Print the value of the count variable
    }
}

package HW.e1.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
       char operator='*';

       int num1=25;

       int num2=2;

       int result=0;

       if(operator=='+'){
       result=num1 + num2;
           System.out.println("The sum is: " + result);
       } else if (operator == '-'){
           result=num1-num2;
           System.out.println("The difference is: " + result);
       } else if (operator=='*') {
           result=num1*num2;
           System.out.println("The product is: " + result);
       } else if (operator=='/') {
           result=num1/num2;
           System.out.println("The quoteint is: " + result);

       }else{
           System.out.println("Invalid operator");
       }


        // Declare two variables for numbers and assign values


        // Perform the corresponding arithmetic operation

    }}


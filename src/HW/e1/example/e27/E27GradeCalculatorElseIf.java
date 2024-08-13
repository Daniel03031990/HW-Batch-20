package HW.e1.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        int score=90;
        if(score>=100){
            System.out.println("Your grade is: A");
        }else if(score>=89){
            System.out.println("Your grade is: B");
        }else if(score>=79){
            System.out.println("Your grade is: C");
        }else if(score>=69){
            System.out.println("Your grade is: D");
        }else{
            System.out.println("Your grade is: F");
        }


        //Use if-else if statements to check grades A, B, C, D, F in order
        // Hint: Print the grade using System.out.println()

        // Expected output: "Your grade is: B"
    }
}
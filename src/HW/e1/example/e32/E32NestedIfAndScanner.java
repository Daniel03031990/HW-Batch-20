package HW.e1.example.e32;
import java.util.Scanner;
public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");

        String gender= scanner.nextLine();

        System.out.println("Please enter your age");

        int age= scanner.nextInt();

        if(age>25){
            if(gender.equals("F")){
                System.out.println("Woman");
            }else{
                System.out.println("Man");
            }




        }else{
            if(age<=25){
                if(gender.equals("F")){
                    System.out.println("Girl");

                }else{
                    System.out.println("Boy");


            }
            }

        }





















    }}
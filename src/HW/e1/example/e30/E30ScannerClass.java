package HW.e1.example.e30;
import java.util.Scanner;
public class E30ScannerClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
           Scanner scan=new Scanner(System.in);
        // Print prompt for user to input the month number
        System.out.println("Please enter the month number");
        // Capture the month number
          int monthNumber=scan.nextInt();

          if(monthNumber==1){
              System.out.println("January");
          } else if (monthNumber==2) {
              System.out.println("February");
          } else if (monthNumber==3) {
              System.out.println("march");
          } else if (monthNumber==4) {
              System.out.println("April");
          } else if (monthNumber==5) {
              System.out.println("May");
          }else if(monthNumber==6){
              System.out.println("June");
          }else if(monthNumber==7){
              System.out.println("July");
          } else if (monthNumber==8) {
              System.out.println("August");
          }else if (monthNumber==9){
              System.out.println("September");
          } else if (monthNumber==10) {
              System.out.println("October");
          } else if (monthNumber==11) {
              System.out.println("November");

          } else if (monthNumber==12) {
              System.out.println("December");

          }else{
              System.out.println("Invalid");
          }


        // If the value is between 1 and 12, print the corresponding month name
        // If the value is out of range, print "Invalid"
    }
}

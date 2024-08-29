package HW.e1.example.e107;

public class E112JavaMethods {
    public static void main(String[] args) {
        // Call method printNumbers
        E112JavaMethods m=new E112JavaMethods();

        m.printNumbers();

    }

    // Create method printNumbers that prints numbers from 1 to 10

    void printNumbers(){
        int num=0;
        for (int i = 0; i<=9 ; i++) {
            num++;
            System.out.println(num);
        }
    }

}

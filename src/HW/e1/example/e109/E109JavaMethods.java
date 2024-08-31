package HW.e1.example.e109;

public class E109JavaMethods {
    public static void main(String[] args) {
        // Call newLine method three times

        E109JavaMethods method=new E109JavaMethods();

        method.newLine();

    }




    void newLine(){
        String main="newLine method implementation";

        for (int i = 0; i <= 2; i++) {
            System.out.println(main);

        }

    }


}

package HW.e1.example.e119;

public class E119JavaMethods {
    public static  String censorLetter(String str,char c) {
        return str.replace(c, '*');




    }
    public static void main(String[] args) {
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));

        // Students will write the code here.
    }

}

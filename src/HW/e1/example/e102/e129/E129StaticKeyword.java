package HW.e1.example.e102.e129;

public class E129StaticKeyword {

    static String countryName;
    static String continent;

    static void method(){
        System.out.println(countryName+" located on "+continent+" continent");


    }
    public static void main(String[] args) {

        countryName="Morocco";
        continent="Africa";

        method();






    }
}

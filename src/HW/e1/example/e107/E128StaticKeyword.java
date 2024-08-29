package HW.e1.example.e107;

public class E128StaticKeyword {
    static String mixstring(String s1,String s2){
        String combined= "";
        for (int i = 0; i < s1.length(); i++) {
            combined=s1.charAt(i) + "" + s2.charAt(i);
            System.out.print(combined);

        }
        return combined;


    }



    public static void main(String[] args) {
        mixstring("12345", "abcde");
        System.out.println();



    }

}
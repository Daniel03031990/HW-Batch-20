package HW.e1.example.e107;

public class E118JavaMethods {
    public static String spaceOut (String s){
        String space= "";
        for (int i = 0; i < s.length(); i++) {
            space+=s.charAt(i) + " ";

        }
        return space;



    }

    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println("spaceout(\"hello\")==> " + spaceOut("hello"));
        System.out.println("spaceout(\"hello\")==> " + spaceOut("technology"));





    }
}

package HW.e1.example.e102.e131;

public class E131StaticKeyword {
    public static  String thirdletter(String s){
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < s.length(); i+=3) {
            result.append(s.charAt(i));


        }
        return result.toString();

    }



    public static void main(String[] args) {
        System.out.println(thirdletter("hello there"));
        System.out.println(thirdletter("technology"));
    }
}

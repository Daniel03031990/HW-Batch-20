package HW.e1.example.e102.e133;

public class E133StaticKeyword {
    static int count(String b) {
        int coun = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i)=='a'|| b.charAt(i)=='A'){
                coun++;
            }

        }
        return coun;

    }

    public static void main(String[] args) {
        E133StaticKeyword a=new E133StaticKeyword();
        System.out.println(a.count("aaa"));
        System.out.println(a.count("aaBBdf8k3AAadnklA"));

    }
}


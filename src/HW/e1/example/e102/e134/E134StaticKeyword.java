package HW.e1.example.e102.e134;

public class E134StaticKeyword {
public static int CountVowels(String s){

    char letter;
    int count=0;
    for (int i = 0; i < s.length(); i++) {
        letter=s.charAt(i);
        if (letter=='a'|| letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            count++;
        }

    }

    return count;
}

    public static void main(String[] args) {
        System.out.println(CountVowels("obama"));
        System.out.println(CountVowels("happy friday! i love weekends"));
    }


}


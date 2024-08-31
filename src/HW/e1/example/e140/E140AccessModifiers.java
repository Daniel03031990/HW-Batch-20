package HW.e1.example.e140;

public class E140AccessModifiers {
    static private String maxLength(String[] words) {


        String longestWord = words[0];


        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
            return longestWord;
        }


        public static void main (String[]args){
        String[]words={"this is long","that","Home","gray"};
            System.out.println(maxLength(words));

        }
    }

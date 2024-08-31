package HW.e1.example.e138;

import org.example.e136.E136AccessModifiers;

public class E138AccessModifiers {

       public class AnotherClass{
              public static String Publicmethod(){
                     return "public";
              }
              static String Defaultmethod(){
                     return "default";
              }
              protected static String ProtectedMethod(){
                     return "protected";
              }

              private static String PrivateVoid(){
                     return "private";
              }





       }

       public static void main(String[] args) {
              System.out.println(AnotherClass.Defaultmethod());
              System.out.println(AnotherClass.ProtectedMethod());
              System.out.println(AnotherClass.Publicmethod());
              System.out.println(AnotherClass.PrivateVoid());




       }
}

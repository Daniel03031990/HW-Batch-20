package HW.e1.example.e102.e137;

public class E137AccessModifiers {
    String name="John";
    String city="Miami";
    String NameOfTheSchool="Syntax";
    int BatchNumber=9;
    private void PrivateVoid(){
        System.out.println("My name is "+name+" and I live in "+ city+". I study at "+ NameOfTheSchool+" in batch "+BatchNumber);

    }


    public static void main(String[] args) {
        E137AccessModifiers m=new E137AccessModifiers();
        m.PrivateVoid();




    }
}


package HW.e1.example.e136;

public class E136AccessModifiers {
    private void PrivateVoid(){
        System.out.println("This is Private Method");
    }
    void Defaultmethod(){
        System.out.println("This is Default Method");
    }
    protected void ProtectedMethod(){
        System.out.println("This is Protected Method");
    }
    public void Publicmethod(){
        System.out.println("This is Public Method");
    }


    public static void main(String[] args) {
        E136AccessModifiers m=new E136AccessModifiers();
        m.PrivateVoid();
        m.Defaultmethod();
        m.ProtectedMethod();
        m.Publicmethod();

    }
}



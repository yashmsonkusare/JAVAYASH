package Yash;
interface Default{
    default void print(){
        System.out.println("Print Default");
    }
    public void method();
    static int methodStatic(int x){
        return x*x;
    }
}
public class DefaultMethodInInterface implements Default{
    @Override
    public void method() {
        System.out.println("Print Abstract Method");
    }
    public void print(){
        System.out.println("Print Default Override");
    }

    public static void main(String[] args) {
        Default d=new DefaultMethodInInterface();
        d.method();
        d.print();
        System.out.println(Default.methodStatic(23));
    }
}

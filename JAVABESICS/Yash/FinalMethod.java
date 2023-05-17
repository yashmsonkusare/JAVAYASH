package Yash;
class VerMeth{
    final public void show(){
        int i=10;
        System.out.println(i);
    }
}
class VerMeth2 extends VerMeth{
    public void run(){
        System.out.println("Running");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        VerMeth2 verMeth2=new VerMeth2();
        verMeth2.run();
        verMeth2.show();
    }
}

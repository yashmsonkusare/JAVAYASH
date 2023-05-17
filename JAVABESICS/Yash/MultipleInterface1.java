package Yash;
interface AB{
    public void method();
}
interface BC{
    public void method();
}
public class MultipleInterface1 implements AB,BC{
    @Override
    public void method() {
        System.out.println("Multiple Interface");
    }
    public static void main(String[] args) {
        AB ab=new MultipleInterface1();
        ab.method();
    }
}

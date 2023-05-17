package Yash;
interface Demo{
    public void A();
    public void B();
    public void C();
    public void D();
}
abstract class Demo2 implements Demo{
    public void A(){
        System.out.println("Abstract Interface A");
    }
}
class Demo3 extends Demo2{
    @Override
    public void B() {
        System.out.println("Abstract Interface B");
    }

    @Override
    public void C() {
        System.out.println("Abstract Interface C");
    }

    @Override
    public void D() {
        System.out.println("Abstract Interface D");
    }
}
public class AbstractInterface {
    public static void main(String[] args) {
        Demo3 demo3=new Demo3();
        demo3.A();
        demo3.B();
        demo3.C();
        demo3.D();
    }
}

package Yash;
interface NewClass{
    public void m1();
}
interface NewClass1 extends NewClass{
    public void m2();
}
public class MultipleInterface implements NewClass1{
    @Override
    public void m1() {
        System.out.println("Print new class");
    }

    @Override
    public void m2() {
        System.out.println("Print new class1");
    }

    public static void main(String[] args) {
//        NewClass n=new MultipleInterface();
//        n.m1();
        NewClass1 n1=new MultipleInterface();
        n1.m2();
        n1.m1();
    }
}

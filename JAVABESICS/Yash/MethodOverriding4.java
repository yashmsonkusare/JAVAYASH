package Yash;
class A2{
    public void method1(){
        System.out.println("Condition");
    }
}
class B2 extends A2{
    public void method1(){
        System.out.println("Condition2");
    }
}
public class MethodOverriding4 {
    public static void main(String[] args) {
        B2 a2=new B2();
        a2.method1();
    }
}

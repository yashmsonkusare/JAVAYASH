package Yash;
class A1{
    A1 get(){
        System.out.println("Return A");
        return this;
    }
}
class B1 extends A1{
    B1 get(){
        System.out.println("Return B");
        return this;
    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        B1 b1=new B1();
        b1.get();
    }
}

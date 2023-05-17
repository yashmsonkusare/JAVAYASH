package Yash;
class A{
    public Number method(int x){
        return x;
    }
}
class B extends A{
    public Long method(int x){
        return (long)x;
    }
}
public class TypePromotionInOverloading {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        System.out.println(a.method(10));
        System.out.println(b.method(10));
    }
}

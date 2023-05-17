package Yash;
class demo{
    Object meth(){
        return this;
    }
}
class demo2 extends  demo{
    String meth(){
        return "demo";
    }
}
public class MethodOverriding3 {
    public static void main(String[] args) {
        demo2 demo2=new demo2();
        demo2.meth();
    }
}

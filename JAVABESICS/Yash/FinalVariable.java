package Yash;
class Variable{
    final int a=100;
    public void ver(){
        System.out.println(a);
    }
}
public class FinalVariable {
    public static void main(String[] args) {
        Variable variable=new Variable();
        variable.ver();
    }
}

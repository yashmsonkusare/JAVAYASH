package Yash;

public class CompileTimePolymorphism {
    void test(){
        System.out.println("Compile Time Polymorphism");
    }
    void test(int a){
        System.out.println("Compile Time Polymorphism"+a);
    }
    void test(int a,int b){
        System.out.println("Compile Time Polymorphism"+" "+a+" "+b);
    }
    double test(double c){
        System.out.println("Compile Time Polymorphism"+c);
        return c;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism compileTimePolymorphism=new CompileTimePolymorphism();
        compileTimePolymorphism.test();
        compileTimePolymorphism.test(13);
        compileTimePolymorphism.test(34,21);
        double result= compileTimePolymorphism.test(23.12);
    }
}

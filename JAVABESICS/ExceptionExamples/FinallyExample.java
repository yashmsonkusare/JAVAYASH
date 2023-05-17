package ExceptionExamples;

import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{
            int sum=a/b;
            System.out.println(sum);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            int sum1=b/a;
            System.out.println("Finally = "+sum1);
        }
    }
}

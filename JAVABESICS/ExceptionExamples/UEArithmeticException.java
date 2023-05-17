package ExceptionExamples;

public class UEArithmeticException {
    public static void main(String[] args) {
        try{
            int a=23;
            int b=0;
            int output=a/b;
            System.out.println(output);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

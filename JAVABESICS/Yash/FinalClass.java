package Yash;
class BlankFinalVariable{
    final int blankVariable;
    final static int blankStaticVariable;
    static {
        blankStaticVariable=1223;
    }
    BlankFinalVariable(){
        blankVariable=211;
    }
    public void method(){
        System.out.println(blankVariable);
        System.out.println(blankStaticVariable);
    }
}
public class FinalClass {
    public static void main(String[] args) {
        BlankFinalVariable blankFinalVariable=new BlankFinalVariable();
        blankFinalVariable.method();
    }
}

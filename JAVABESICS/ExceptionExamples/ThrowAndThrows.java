package ExceptionExamples;
class ValueNotFount extends Exception{
    ValueNotFount(String s){
        super(s);
    }
}
public class ThrowAndThrows{
    public static void main(String[] args) throws ValueNotFount {
        throw new ValueNotFount("Value Not Fount");
    }
}

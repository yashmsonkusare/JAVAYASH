package ExceptionExamples;

public class UEArrayStoreException {
    public static void main(String[] args) {
        Object[] objectArray=new String[2];
        try{
            objectArray[0]=new Integer(8);
        }catch (ArrayStoreException e){
            System.out.println(e);
        }
    }
}

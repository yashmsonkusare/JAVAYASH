package ExceptionExamples;

public class UEArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        try {
            array[5]=5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

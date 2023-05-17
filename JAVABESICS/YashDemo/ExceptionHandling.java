package YashDemo;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }
        int[] arr={1,2,3,4};
        try {
            arr[6]=6;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }


    }
}

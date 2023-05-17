package ExceptionExamples;

public class UEIllegalThreadStateException {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("Thread start");
        });
        thread.start();
        try{
            thread.start();
        }catch (IllegalThreadStateException e){
            System.out.println(e);
        }
    }
}

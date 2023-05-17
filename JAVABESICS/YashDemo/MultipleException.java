package YashDemo;

import java.io.IOException;

public class MultipleException {
    void method(int a) throws IOException,ClassNotFoundException{
        if (a==0){
            throw new IOException("IOException found");
        }
        else {
            throw new ClassNotFoundException("ClassNotFoundException found");
        }
    }

    public static void main(String[] args) {
        MultipleException multipleException=new MultipleException();
        try {
            multipleException.method(2);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

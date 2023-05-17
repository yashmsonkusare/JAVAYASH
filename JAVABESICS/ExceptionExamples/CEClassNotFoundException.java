package ExceptionExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CEClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("Zack");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}

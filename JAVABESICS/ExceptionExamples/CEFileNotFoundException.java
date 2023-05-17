package ExceptionExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CEFileNotFoundException {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("name.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}

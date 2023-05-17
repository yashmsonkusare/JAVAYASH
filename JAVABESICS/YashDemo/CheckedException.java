package YashDemo;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("example.txt");
            fileReader.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

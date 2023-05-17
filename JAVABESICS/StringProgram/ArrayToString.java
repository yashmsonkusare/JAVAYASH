package StringProgram;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] strArray={"My","name","is","yash"};
        System.out.println(Arrays.toString(strArray));
        System.out.println(String.join(" ",strArray));
    }
}

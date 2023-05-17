package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[]c1=s1.toLowerCase().toCharArray();
        char[]c2=s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println("It is Anagram y/n");
        if(Arrays.equals(c1,c2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

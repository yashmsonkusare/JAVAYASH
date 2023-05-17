package YashDemo;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int i=0;
        for (char c:arr){
            i++;
        }
        System.out.println("Length ="+s.length()+" "+i);

    }
}

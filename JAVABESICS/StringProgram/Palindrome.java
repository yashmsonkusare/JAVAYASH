package StringProgram;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString= sc.nextLine();
        String reverse="";
        for(int i=inputString.length()-1;i>=0;i--){
            reverse=reverse+inputString.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("It is Palindrome y/n");
        if (inputString.equals(reverse)){
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}

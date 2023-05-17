package YashDemo;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),reverse="";
        System.out.println(s.length());
        for (int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equals(s)){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}

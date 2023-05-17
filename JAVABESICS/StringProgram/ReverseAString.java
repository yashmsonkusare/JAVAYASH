package StringProgram;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        String reverse="";
        int length=inputString.length();
        for (int i=length-1;i>=0;i--){
            reverse=reverse+inputString.charAt(i);
        }
        System.out.println("Reverse string of "+"'"+inputString+"'"+" is "+"'"+reverse+"'");
    }
}

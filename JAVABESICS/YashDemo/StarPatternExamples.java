package YashDemo;

import java.util.Scanner;

public class StarPatternExamples {
    public static void main(String[] args) {
        int row=7;
        for (int i= 1; i<= row; i++)
        {
            for (int j=1; j<=row-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i= row-1; i>=1; i--)
        {
            for (int j=1; j<=row-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=0;i<row;i++){
            for (int s=0;s<row-i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<row;i++){
            for (int s=0;s<row-i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=row;i++){
            for (int j=0;j<=7;j++){
                if(i==1||i==row||j==3||j==4){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}

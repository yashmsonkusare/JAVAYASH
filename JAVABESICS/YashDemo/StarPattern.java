package YashDemo;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        int rows=5;
        //triangle
        System.out.println("Triangle");
        for (int i=0;i<=rows;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //arrow head
        System.out.print("Arrow Head");
        for (int i=0;i<=rows;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted
        for (int i=rows;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //equilateral triangle
        System.out.println("Equilateral Triangle");
        for (int i=0;i<rows;i++){
            for (int s=0;s<rows-i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //diamond
        System.out.println("Diamond");
        for (int i=0;i<rows;i++){
            for (int s=0;s<rows-i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=rows;i>=0;i--){
            for (int s=0;s<rows-i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //hollow square
        System.out.println("Hollow Square");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1|| j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //hollow rectangle
        System.out.println("Hollow Rectangle");
        for (int i=1;i<=rows;i++){
            for (int j=0;j<=9;j++){
                if(i==1||i==rows||j==0||j==9){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //square
        System.out.println("Square");
        for (int i=1;i<=rows;i++){
            for (int j=0;j<=rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //rectangles
        System.out.println("Rectangle");
        for (int i=1;i<=rows;i++){
            for (int j=0;j<=9;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Triangle right side mirror
        System.out.println("Arrow pointing left");
        for (int i=1;i<=rows;i++)
        {
            for (int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=rows-1;i>=1;i--)
        {
            for (int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("                  *****\n" +
                "                  ****\n" +
                "                  *****\n" +
                "                  *******\n" +
                "       ***        *********\n" +
                "       ****     *****************\n" +
                "      *************************        ** \n" +
                "       ****     *****************\n" +
                "       ***        *********\n" +
                "                  *******\n" +
                "                  *****\n" +
                "                  ****\n" +
                "                  *****");
    }
}

package Yash;

import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size");
        int length=sc.nextInt();
        int[] array=new int[length];
        System.out.println("Enter an array value");
        for (int i=0;i<length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Search the number");
        int searchNumber= sc.nextInt();
        for (int j=0;j<length;j++){
            if (array[j]==searchNumber){
                j=j+1;
                System.out.println("The number "+searchNumber+" is at position "+j);
                System.exit(0);
            }
        }
        System.out.println("Number not found");
    }
}

package Yash;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr={8,32,21,45,16,61,25};
        //sorting the array
        Arrays.sort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int first=0;
        int last=arr.length-1;
        int middle=(first+last)/2;

        System.out.println("Number to be search");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        while(first<=last){
            if (arr[middle]<input){
                first=middle+1;
            } else if (arr[middle]==input) {
                System.out.println(middle+1+" "+input);
                System.exit(0);
            }else {
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if(first>last){
            System.out.println("Not found");
        }
    }
}

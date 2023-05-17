package Yash;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-i-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        System.out.println("Sorted array:");
        for (int i:arr){
            System.out.println(i+" ");
        }
        System.out.println();
        sort sortArray=new sort();
        sortArray.arraySortMethod();
    }
}
class sort{
    public void arraySortMethod(){
        int[] a={5,32,18,20,12};
        Arrays.sort(a);
        for (int i:a) {
            System.out.println(i + " ");
        }
    }
}

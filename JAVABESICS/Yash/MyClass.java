package Yash;

public class MyClass {
    public static void main(String[] args) {
        //print 100 numbers
        //for loop
        System.out.println("The numbers are in for :");
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
        //while loop
        int a=1;
        System.out.println("The numbers are in while :");
        while(a<=100){
            System.out.println(a);
            a++;
        }

        //do while loop
        int b=1;
        System.out.println("The numbers are in do while :");
        do {
            System.out.println(b);
            b++;
        }while (b<=100);

        //Program to find the sum of numbers from 20 to 30
        int sum=0;
        for(int j=20;j<=30;j++){
            sum=sum+j;
        }
        System.out.print("The sum of numbers from 20 to 30 is: ");
        System.out.println(sum);

        //program to print pyramid pattern

        for(int k=1;k<=5;k++){
            for(int l=1;l<=k;l++){
                System.out.print("@");
            }
            System.out.println();
        }

        //Inverted pyramid

        for(int p=1;p<=6;p++){
            for(int m=6;m>=p;m--){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

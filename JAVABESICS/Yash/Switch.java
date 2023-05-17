package Yash;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        switch(a){
            case 1:
                System.out.println("Value Entered = "+a);
                break;
            case 2:
                System.out.println("Value Entered = "+a);
                break;
            case 3:
                System.out.println("Value Entered = "+a);
                break;
            case 4:
                System.out.println("Value Entered = "+a);
                break;
            default:
                System.out.println("Value out of the case");
        }
    }
}

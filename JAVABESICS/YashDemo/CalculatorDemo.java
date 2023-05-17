package YashDemo;
import Yash.Calculator;
//Built-in Packages
import java.util.Date;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.addition(3,4);
        calculator.multiplication(23,4,11);
        calculator.subtraction(23,12);
        Date today=new Date();
        System.out.println(today);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int div=a/b;
        System.out.println("Division = "+div);
    }
}

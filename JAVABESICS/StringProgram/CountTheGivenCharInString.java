package StringProgram;

import java.util.Scanner;

public class CountTheGivenCharInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        char inputChar=sc.next().charAt(0);
        int count=0;
        for (int i=inputString.length()-1;i>=0;i--){
            if (inputString.charAt(i)==inputChar){
                count++;
            }
        }
        System.out.println("The count for "+"'"+inputChar+"'"+" is "+"'"+count+"'");
    }
}

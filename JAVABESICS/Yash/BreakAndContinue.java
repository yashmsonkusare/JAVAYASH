package Yash;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if (i==7){
                break;
            }
            System.out.println(i);
        }
        for(int j=1;j<=10;j++){
            if (j%2==0){
                continue;
            }
            System.out.println(j);
        }
    }
}

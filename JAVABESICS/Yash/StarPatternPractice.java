package Yash;

public class StarPatternPractice {
    public static void main(String[] args) {
        int row=6;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=row;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=row;i++){
            for(int s=1;s<=row-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=row-1;i>=1;i--){
            for(int s=1;s<=row-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=row;i++){
            for(int s=1;s<=row-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=row-1;i>=1;i--){
            for(int s=1;s<=row-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=3;i++){
            for (int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if (i==1||i==row||j==1||j==row){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=4;i++){
            for (int j=1;j<=row;j++){
                if (i==1||i==4||j==1||j==row){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

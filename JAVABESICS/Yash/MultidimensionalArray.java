package Yash;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        JaggedArray jaggedArr=new JaggedArray();
        jaggedArr.jaggedArray();
        System.out.println();
        SumOfTwoMatrices sum=new SumOfTwoMatrices();
        sum.sumOfTwoMatrices();
    }
}
class JaggedArray{
    public void jaggedArray(){
        int[][] array=new int[3][];
        array[0]=new int[4];
        array[1]=new int[5];
        array[2]=new int[2];

        int count=0;

        for (int i=0;i<array.length;i++){
            for (int j=0;j< array[i].length;j++){
                array[i][j]=count++;
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j< array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class SumOfTwoMatrices{
    public void sumOfTwoMatrices(){
        int a[][]={{7,8,4},{9,2,3}};
        int b[][]={{3,1,5},{2,0,9}};
        int c[][]=new int[2][3];
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}

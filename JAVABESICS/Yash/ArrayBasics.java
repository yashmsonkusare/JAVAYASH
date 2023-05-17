package Yash;

public class ArrayBasics {
    public static void main(String[] args) {
        int x=1;
        x=2;
        x=3;
        x=4;

        int[] array=new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;

        for (int i=0;i<=3;i++){
            System.out.println(array[i]);
        }

        //String array
        String[] names={"Yash","Zack","Raptor"};
        for(String n:names){
            System.out.println(n);
        }
    }
}

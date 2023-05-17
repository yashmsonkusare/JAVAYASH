package Yash;

public class MethodOverloading {
    public static void area(int a,int b){
        int area=a*b;
        System.out.println(area);
    }
    public static void area(int value){
        int area2=value*value;
        System.out.println(area2);
    }

    public static void area(float x,float y){
        System.out.println(x+""+y);
    }

    public static void main(String[] args) {
        MethodOverloading.area(6);
        MethodOverloading.area(34,21);
        MethodOverloading.area(23,71);
    }
}

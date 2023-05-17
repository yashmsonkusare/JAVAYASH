package Yash;

import java.awt.desktop.SystemEventListener;

class Super{
    int i;
    int j;
}
class Super2 extends Super{
    int i;
    public void method(){
        i=10;
        super.i=23;
        j=20;
        System.out.println(i);
        System.out.println(super.i);
        System.out.println(j);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Super2 super2=new Super2();
        super2.method();
    }
}

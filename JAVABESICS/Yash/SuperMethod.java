package Yash;
class One{
    int i;
    public void method(int i){
        this.i=i;
        System.out.println("Value of i= "+i);
    }
}
class Two extends One{
    int j;
    public void method(int j){
        super.method(8);
        this.j=j;
        System.out.println("Value of j= "+j);
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        Two two=new Two();
        two.method(6);
    }
}

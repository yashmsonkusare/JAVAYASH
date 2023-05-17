package Yash;
class Concrete{
    String water;
    String aggregate;
    String cement;
    Concrete(String w,String a,String c){
        System.out.println("Base constructor called");
        water=w;
        aggregate=a;
        cement=c;
    }

}
class Ratio extends Concrete{
    String ratio;
    Ratio(String w,String a,String c,String r){
        super(w, a, c);
        System.out.println("Child constructor called");
        ratio=r;
    }
    public void method(){
        System.out.println(ratio+"="+water+":"+aggregate+":"+cement);
    }
}
public class SuperConstrictor {
    public static void main(String[] args) {
        Ratio ratio=new Ratio("1","2","1","M25");
        ratio.method();
    }
}

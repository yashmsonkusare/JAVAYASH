package Yash;
class Counter{
    static int count;
    Counter(){
        count++;
    }
    public void getCount(){
        System.out.println("The count: "+count);
    }
}
public class StaticCounter {
    public static void main(String[] args) {
        Counter counter=new Counter();
        counter.getCount();
        Counter counter1=new Counter();
        counter1.getCount();
    }
}

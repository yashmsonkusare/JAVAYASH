package Yash;
class Private{
    private int number;
    public Private(int number){
        this.number=number;
    }
    public int getNum(){
        System.out.println(number);
        return number;
    }
}
public class PrivateEX {
    public static void main(String[] args) {
        Private p=new Private(2);
        p.getNum();
    }
}

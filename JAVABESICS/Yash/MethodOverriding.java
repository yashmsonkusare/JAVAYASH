package Yash;
class Bank{
    public int rateOfInterest(){
        return 0;
    }
}
class PNB extends Bank{
    public int rateOfInterest(){
        return 8;
    }
}
class SBI extends Bank{
    public int rateOfInterest(){
        return 7;
    }
}
class HDFC extends Bank{
    public int rateOfInterest(){
        return 9;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        PNB pnb=new PNB();
        int a=pnb.rateOfInterest();
        SBI sbi=new SBI();
        int b=sbi.rateOfInterest();
        HDFC hdfc=new HDFC();
        int c=hdfc.rateOfInterest();
        System.out.println(a+" "+b+" "+c);
    }
}

package Yash;
abstract class vehicle{
    abstract void method();
}
class Car extends vehicle{
    public void method(){
        System.out.println("Supra Twin Turbo V12");
    }
}
class Bike extends vehicle{
    public void method(){
        System.out.println("HONDA CBR1000RR-R SP 30th Anniversary Dark");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Car car=new Car();
        car.method();
        Bike bike=new Bike();
        bike.method();
    }
}

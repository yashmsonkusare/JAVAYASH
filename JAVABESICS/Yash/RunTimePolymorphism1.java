package Yash;
class Drones{
    public void noOfPropellers(){
        System.out.println("Drone with propellers");
    }
}
class Helicopter extends Drones{
    public void noOfPropellers(){
        System.out.println("Drone with single propellers");
    }
}
class Quadcopter extends Helicopter{
    public void noOfPropellers(){
        System.out.println("Drone with quad propellers");
    }
}

public class RunTimePolymorphism1 {
    public static void main(String[] args) {
        Drones d;
        d=new Drones();
        d.noOfPropellers();
        d=new Helicopter();
        d.noOfPropellers();
        d=new Quadcopter();
        d.noOfPropellers();
    }
}

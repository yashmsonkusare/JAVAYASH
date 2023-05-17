package Yash;
class Bird{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
class Parrot extends Bird{
    public void talk(){
        System.out.println("Talk");
    }
}
class Cockatoo extends Parrot{
    public void colour(){
        System.out.println("White and yellow");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.sleep();
        parrot.talk();

        Cockatoo cockatoo=new Cockatoo();
        cockatoo.colour();
        cockatoo.eat();
        cockatoo.sleep();
        cockatoo.talk();
    }
}
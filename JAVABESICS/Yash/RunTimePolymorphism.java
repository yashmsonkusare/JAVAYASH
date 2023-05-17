package Yash;
class Shape{
    public void shape(){
        System.out.println("Draw a shape");
    }
}
class Hexagon extends Shape{
    public void shape(){
        System.out.println("Draw a Hexagon");
    }
}
class Octagon extends Shape{
    public void shape(){
        System.out.println("Draw a Octagon");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Shape s;
        s=new Shape();
        s.shape();
        s=new Hexagon();
        s.shape();
        s=new Octagon();
        s.shape();
    }
}

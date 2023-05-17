package Yash;
interface ShapesOf{
    public void method();
    public void print();
}
class Quadrilateral implements ShapesOf{
    @Override
    public void method() {
        System.out.println("Print the shape Quadrilateral");
    }

    @Override
    public void print() {
        System.out.println("Print the shape Quadrilateral");
    }
}
class Pentagon implements ShapesOf{
    @Override
    public void method() {
        System.out.println("Print the shape Pentagon");
    }
    @Override
    public void print() {
        System.out.println("Print the shape Pentagon");
    }
}
public class InterfaceClass1 {
    public static void main(String[] args) {
        Quadrilateral q=new Quadrilateral();
        q.method();
        q.print();
        Pentagon p=new Pentagon();
        p.method();
        p.print();
    }
}

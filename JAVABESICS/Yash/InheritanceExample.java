package Yash;
class Box{
    double length;
    double width;
    double height;
    public Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public void volume(){
        double vol=length*width*height;
        System.out.println(vol);
    }
}
class BoxWeight extends Box{
    double weight;
    public BoxWeight(double weight,double length,double width,double height){
        super(length,weight,height);
        this.weight=weight;
    }
    public void weightOfBox(){
        System.out.println(weight);
    }

    @Override
    public void volume() {
        super.volume();
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        BoxWeight boxWeight=new BoxWeight(12,23,41,20);
        boxWeight.volume();
        boxWeight.weightOfBox();
    }
}

package Yash;
class AreaBox{
    double len;
    double wid;
    double hei;
    AreaBox(){
        len=23.2;
        wid=12.54;
        hei=42.8;
    }
    AreaBox(double le){
        len=wid=hei=le;
    }
    AreaBox(double len,double wid,double hei){
        this.len=len;
        this.wid=wid;
        this.hei=hei;
    }
    public void volume(){
        double volume=len*wid*hei;
        System.out.println(volume);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        AreaBox areaBox=new AreaBox();
        areaBox.volume();
        AreaBox areaBox1=new AreaBox(12.3);
        areaBox1.volume();
        AreaBox areaBox2=new AreaBox(12.3,41.34,51.2);
        areaBox2.volume();
    }

}

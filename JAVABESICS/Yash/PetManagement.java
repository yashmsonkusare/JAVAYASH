package Yash;

class Drone{
    String Type;
    String Use;
    int weapons;
    int payload;
    public String getInfo(){
        return ("Type of drone: "+Type+"Used for: "+Use+"Can carry weapons: "+weapons+"Can carry a payload up to: "+payload+"Kg");
    }
}
public class PetManagement {
    public static void main(String[] args){
        Drone specs=new Drone();
        specs.Type="Rustum";
        specs.Use="Combat use";
        specs.weapons=4;
        specs.payload=60;

        String info=specs.getInfo();
        System.out.println(info);

    }

}

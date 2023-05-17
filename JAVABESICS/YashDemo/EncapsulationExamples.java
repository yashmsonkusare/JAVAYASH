package YashDemo;
//Provides you control over the data
class Capsule{
    private int ID;

    public void setID(int ID) {
        if(ID<=100){
            this.ID=ID;
        }else {
            System.out.println("ID range exceed");
        }
    }

    public int getID() {
        return ID;
    }
}
public class EncapsulationExamples extends Capsule{
    public static void main(String[] args) {
        Capsule capsule=new Capsule();
        capsule.setID(100);
        System.out.println(capsule.getID());
    }
}

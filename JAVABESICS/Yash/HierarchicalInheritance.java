package Yash;
class Animals{
    public void sleeps(){
        System.out.println("Sleeping");
    }
}
class Dogs extends Animals{
    public void barks(){
        System.out.println("Barking");
    }
}
class Birds extends Animals{
    public void talks(){
        System.out.println("Talking");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dogs dogs=new Dogs();
        dogs.sleeps();
        dogs.barks();
        Birds birds=new Birds();
        birds.sleeps();
        birds.talks();
    }
}

package YashDemo;

class Animal{
    public void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    public void sound(){
        super.sound();
        System.out.println("Dog is barking");
    }

}
public class SuperExample {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();
    }
}

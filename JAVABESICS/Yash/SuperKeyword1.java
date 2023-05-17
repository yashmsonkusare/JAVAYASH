package Yash;
class Reptiles{
    String name="Comodo Driagon";
}
class Snake extends Reptiles{
    String name="Black Mamba";
    public void method(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class SuperKeyword1 {
    public static void main(String[] args) {
        Snake snake=new Snake();
        snake.method();
    }
}

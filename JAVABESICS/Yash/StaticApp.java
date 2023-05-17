package Yash;
class Employee{
    String name;
    String Designation;
    static String company="TF";
    Employee(String name,String Designation){
        this.name=name;
        this.Designation=Designation;
    }
    public void display(){
        System.out.println("Employee name:"+name+";"+"Designation:"+Designation+";"+"Company:"+company);
    }
}
public class StaticApp {
    public static void main(String[] args){
        Employee details=new Employee("Yash","Jr Software Engineer");

        details.display();
    }
}

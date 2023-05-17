package Yash;

class Students{
    String name;
    String subject;
    String year;
    Students(String name,String subject,String year){
        this.name=name;
        this.subject=subject;
        this.year=year;
    }
}
public class StudentArray {
    public static void main(String[] args) {
        Students[] students=new Students[2];
        students[0]=new Students("Zack","Robotics","3rd");
        students[1]=new Students("Raptor","Aeronautics","4th");

        for (Students s:students){
            System.out.println("Name:"+s.name+"Subject:"+s.subject+"Year"+s.year);
        }
    }
}

package Yash;
class Banks{
    private String name;
    private int ssc;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSsc() {
        return ssc;
    }

    public void setSsc(int ssc) {
        this.ssc = ssc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Banks banks=new Banks();
        banks.setName("Yash");
        banks.setSsc(213);
        banks.setSalary(25000);

        System.out.println(banks.getName());
        System.out.println(banks.getSalary());
        System.out.println(banks.getSsc());
    }
}

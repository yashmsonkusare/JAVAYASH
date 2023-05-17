package Yash;

interface PrintTable{
    public void print();
}
public class InterfaceClass implements PrintTable{
    @Override
    public void print() {
        System.out.print("Print the table");
    }
    public static void main(String[] args) {
        PrintTable printTable=new InterfaceClass();
        printTable.print();
    }
}

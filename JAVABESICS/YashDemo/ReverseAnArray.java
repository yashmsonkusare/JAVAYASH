package YashDemo;

public class ReverseAnArray {
    public static void main(String[] args) {
        String s="Yash";
        char[] arr=s.toCharArray();
        int size=s.length();
        char[] reverse=new char[size];
        int i=0;
        while (i !=size){
            reverse[size-i-1]=arr[i];
            i++;
        }
        System.out.println(reverse);
    }
}

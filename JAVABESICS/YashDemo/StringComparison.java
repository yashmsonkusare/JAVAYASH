package YashDemo;

public class StringComparison {
    public static void main(String[] args) {
        String s1="Yash";
        String s2="Zack";
        String s3=new String("Yash");
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.concat(s2));
        String s4=s1.substring(2);
        System.out.println(s4);
        String s5=s2.substring(1,3);
        System.out.println(s5);
        System.out.println(s2.length());
        System.out.println(s1.charAt(2));
        double a= 8.66;
        double b=a*3;
        System.out.println(b);
        System.out.println();
    }
}

package Yash;
class Enc{
    private String secret="APRIL";

    public String getSecret() {
        return secret;
    }
}
public class ReadOnlyClassENC {
    public static void main(String[] args) {
        Enc enc=new Enc();
        System.out.println(enc.getSecret());
    }
}

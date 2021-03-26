package Acce;

public class StringBufferImpl {
    public static void main(String[] args) {
        String s = "Durga";
        s.concat("Software");
        System.out.println(s.concat("Software"));
        StringBuffer sb = new StringBuffer("Vinit");
        sb.append("welcome");
        System.out.println(sb);
        StringBuilder stringBuilder = new StringBuilder("Hi");
        stringBuilder.append("World");
        System.out.println(
                stringBuilder
        );


    }
}

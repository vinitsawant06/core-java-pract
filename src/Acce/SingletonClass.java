package Acce;

class MySingle {
    private static MySingle mySingle = null;

    private MySingle() {
    }
    public static MySingle single() {
        if(mySingle == null) {
            mySingle = new MySingle();
        }
        return mySingle;
    }
}
public class SingletonClass {


    public static void main(String[] args) {
        MySingle mySingle = MySingle.single();
        MySingle mySingle1 = MySingle.single();
        System.out.println(mySingle == mySingle1);
    }
}

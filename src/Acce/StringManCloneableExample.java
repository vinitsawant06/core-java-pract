package Acce;

public class StringManCloneableExample implements Cloneable{
    private String name;
    private String address;
    StringManCloneableExample(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(100+100+"Simple");
        System.out.println("Simple"+100+100);
        StringManCloneableExample stringManCloneableExample1 = new StringManCloneableExample("Vinit", "Pune");
        StringManCloneableExample stringManCloneableExample2 = (StringManCloneableExample) stringManCloneableExample1.clone();
        System.out.println(stringManCloneableExample1.name);
        System.out.println(stringManCloneableExample2.name);


    }
}

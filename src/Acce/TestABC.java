package Acce;

class TestCon {
    private String name;

    @Override
    public String toString() {
        return "TestCon{" +
                "name='" + name + '\'' +
                '}';
    }

    TestCon(String name) {
        this.name = name;
    }
}

public class TestABC {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        String name = stringBuffer.toString();
        StringBuilder stringBuilder = new StringBuilder("Hellooo");
        String name1 = stringBuilder.toString();
    }
}

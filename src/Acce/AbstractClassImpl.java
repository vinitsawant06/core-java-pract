package Acce;

public abstract class AbstractClassImpl {
    AbstractClassImpl() {
        System.out.println("Abstract class constructor");
    }
}

class AbstractClassService extends AbstractClassImpl {
    AbstractClassService() {
        System.out.println("Child class constructor");
    }

}

class Main {
    public static void main(String[] args) {
        AbstractClassService service = new AbstractClassService();
    }
}

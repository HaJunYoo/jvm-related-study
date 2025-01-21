class Test {
    public Test () {
        System.out.println("Test()");
    }
    public Test(int param) {
        System.out.println("Test(int)");
    }
}

class TestEx extends Test {
    public TestEx() {
        System.out.println("TestEx()");
    }
    public TestEx(int param) {
        super(param);
        System.out.println("TestEx(int)");
    }
}

public class Main {
    public static void main(String[] args) {
        TestEx t = new TestEx(128);
    }
}

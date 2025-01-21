class Test {
    protected byte[] string;
    Test() {
        string = new byte[]{'h', 'e', 'l', 'l', 'o'};
    }
    void setString(String param) {
        string = param.getBytes().clone();
    }
    String getString() {
        String str = new String(string);
        return str;
    }
}

class TestEx extends Test {
    TestEx() {
        string = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new TestEx();
        System.out.println(t.getString());
    }
}

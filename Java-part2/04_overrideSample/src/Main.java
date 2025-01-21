class Test {
    protected int data;
    public void setData(int param) {
        System.out.println("Test.setData()");
        this.data = param;
    }
}
class TestEx extends Test {
    public void setData(int param) {
        System.out.println("TestEx.setDataEx()");
        this.data = param;
    }
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new TestEx();
        TestEx t2 = new TestEx();
        t1.setData(5);
        t2.setData(5);
    }
}

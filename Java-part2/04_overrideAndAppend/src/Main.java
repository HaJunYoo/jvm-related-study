class Test {
    protected int data;
    public void setData(int param) {
        System.out.println("Test.setData()");
        this.data = param;
    }
    public int getData() {
        return data;
    }
}

class TestEx extends Test {
    public void setData(int param) {
        System.out.println("TestEx.setDataEx()");
        if(param < 0)
            param = 0;
        super.setData(param);
    }
}

public class Main {
    public static void main(String[] args) {
        TestEx t = new TestEx();
        t.setData(-5);
        System.out.println(t.getData());
    }
}

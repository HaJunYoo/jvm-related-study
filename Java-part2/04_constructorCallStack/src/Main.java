class MyTest {
    private int parentData = 10;
    MyTest() {
        System.out.println("MyTest()");
    }

    public int getData() {
        return parentData;
    }
    public void printData() {
        System.out.println(parentData);
    }
}

class MyTestEx extends MyTest {
    private int childData = 20;

    MyTestEx() {
        System.out.println("MyTestEx()");
    }

    public int getChildData() {
        return childData;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTestEx t = new MyTestEx();
    }
}
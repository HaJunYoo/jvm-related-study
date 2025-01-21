class MyTest {
    private int data = 5;

    MyTest() {
        data = 10;
    }

    public int getData() {
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTest t = new MyTest();
        System.out.println(t.getData());
    }
}
class MyTest {
    public int data;

    MyTest(int param) {
        this.data = param;
    }

    void printData() {
        int data = 3;
        System.out.println(this.data + data);
    }
}

public class Main {
    public static void main(String[] args) {
        MyTest t1 = new MyTest(5);
        MyTest t2 = new MyTest(10);

        System.out.println(t1.data);
        System.out.println(t2.data);
        t1.printData();
    }
}
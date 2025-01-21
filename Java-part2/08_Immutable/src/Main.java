class MyInt {
    private final int data;
    public MyInt(int param) {
        data = param;
    }

    public int getData() {
        return data;
    }

    public MyInt withInt(int param) {
        return new MyInt(this.data + param);
    }
}

public class Main {
    public static void main(String[] args) {
        MyInt d1 = new MyInt(5);
        MyInt d2 = new MyInt(d1.getData());
        MyInt d3 = d2.withInt(5);

        System.out.println(d1.getData());
        System.out.println(d2.getData());
        System.out.println(d3.getData());
    }
}
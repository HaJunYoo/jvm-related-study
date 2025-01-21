class MyTest {
    private int data;
    public int getData() {
        return data;
    }
    public void setData(int param) {
        data = param;
    }
    public static void setStatic(MyTest data, int param) {
        //this.data = param;
        data.data = param;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
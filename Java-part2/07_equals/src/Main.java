class MyTest {
    int a = 10;

    public int getA() {
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTest t1 = new MyTest();
        MyTest t2 = new MyTest();
        if(t1.equals(t2))
            System.out.println("equal");
        else
            System.out.println("not equal");

        if(t1.hashCode() == t2.hashCode())
            System.out.println("same");
        else
            System.out.println("different");

        System.out.printf("t1: %s: (%x)\n", t1.toString(), t1.hashCode());
        System.out.println("t2: " + t2.toString());
    }
}

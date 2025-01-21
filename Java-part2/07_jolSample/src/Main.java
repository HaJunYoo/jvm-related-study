import org.openjdk.jol.info.ClassLayout;

public class MyTest {
    int a = 10;
    public int getA() {
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTest t = new MyTest();
        System.out.println(
                ClassLayout.parseClass(MyTest.class).toPrintable()
        );
        System.out.println(
                ClassLayout.parseInstance(t).toPrintable()
        );
        System.out.printf("Hash code: %X\n", t.hashCode());
        System.out.println(
                ClassLayout.parseInstance(t).toPrintable()
        );
    }
}
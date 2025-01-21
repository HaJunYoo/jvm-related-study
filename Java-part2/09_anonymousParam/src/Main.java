abstract class Parent {
    public void print() {};
}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("Child class");
    }
}

public class Main {
    public static void testFunc(Parent p) {
        p.print();
    }
    public static void main(String[] args) {
        testFunc(new Child());
        testFunc(new Parent() {
            @Override
            public void print() {
                System.out.println("Anonymous class");
            }
        });
    }
}
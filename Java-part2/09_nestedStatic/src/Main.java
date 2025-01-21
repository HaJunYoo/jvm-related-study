class Outer {
    private int data = 5;
    private static int dataStatic = 10;

    int getInnerData() {
        Inner inner = new Inner();
        return inner.getInData();
    }

    static class Inner {
        private int inData = 50;
        private static int inDataStatic = 100;

        int getInData() { return inData; }
        int getOuterDataStatic() {
            return Outer.dataStatic;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        System.out.println(out.getInnerData());

        Outer.Inner inClass = new Outer.Inner();
        System.out.println(inClass.getOuterDataStatic());
    }
}
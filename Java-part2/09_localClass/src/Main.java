public class Main {
    static void testFunc(Object obj) {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        int local = 20;
        class LocalClass {
            LocalClass(){ data = 10; }
            int data;

            void printData() {
                System.out.println(this.data);
                System.out.println(local);
            }
        }

        LocalClass localClass = new LocalClass();
        testFunc(localClass);
        localClass.printData();
    }
}
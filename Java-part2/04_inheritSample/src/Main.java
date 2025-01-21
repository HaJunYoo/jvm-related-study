class MyTest {
     private int parentData = 10;
     public int getData() {
         return parentData;
     }
     public void printData() {
         System.out.println(parentData);
     }
}

class MyTestEx extends MyTest {
    private int childData = 20;
    public int getChildData() {
        return childData;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTestEx t = new MyTestEx();
        System.out.println(t.getData());
        System.out.println(t.getChildData());
    }
}
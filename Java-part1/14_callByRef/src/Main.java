public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 30, 40, 50};
        printArray(array);
        modifyArray(array);
        printArray(array);
    }

    public static void modifyArray(int[] param) {
        for (int i = 0; i < param.length; i++) {
            param[i] = (i + 1) * 100;
        }
    }

    public static void printArray(int[] param) {
        for (int data : param) {
            System.out.print(data + "\t");
        }
    }
}
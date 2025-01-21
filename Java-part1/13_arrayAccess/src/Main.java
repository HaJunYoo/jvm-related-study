public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 30, 40, 50};

        array[0] = 100;
        array[3] = 200;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d]: %d\n", i, array[i]);
        }
    }
}
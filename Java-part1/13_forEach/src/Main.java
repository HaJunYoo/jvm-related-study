public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50};
        for(int i = 0; i < list.length; ++i) {
            System.out.println("list[" + i + "] " + list[i]);
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] array = {50, 40, 10, 30, 20};
        int max = 0;

        for(int data : array) {
            if (data > max)
                max = data;
            System.out.printf("%d\t", data);
        }

        System.out.println("\nMAX: " + max);
    }
}
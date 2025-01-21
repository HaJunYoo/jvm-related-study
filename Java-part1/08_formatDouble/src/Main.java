public class Main {
    public static void main(String[] args) {
        double data = 123.345;
        System.out.printf("%f, %f\n", data, -data);
        System.out.printf("%.1f, %.2f\n", data, data);
        System.out.printf("%.3f, %.4f\n", data, data);
        System.out.printf("%012.2f\n", data);
    }
}
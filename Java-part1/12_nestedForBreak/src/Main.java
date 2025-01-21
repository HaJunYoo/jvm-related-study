public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 2; ++i) {
            System.out.println("i: " + i);
            for(int j = 0; j < 5; ++j) {
                if (j > 2)
                    break;
                System.out.println("\tj: " + j);
            }
            System.out.println("}");
        }
    }
}
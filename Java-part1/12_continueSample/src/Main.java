public class Main {
    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i < 10; ++i) {
            if(i > 4)
                continue;
            System.out.println("\tfor i: " + i);
        }

        System.out.println("END i: " + i);
    }
}
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5 + i; ++j) {
                if(i + j >= 4)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.print('\n');
        }
    }
}
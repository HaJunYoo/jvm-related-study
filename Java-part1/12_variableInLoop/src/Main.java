import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);

        int ch = 0;
        while((ch = System.in.read()) != 'q') {
            int cnt = 0;
            System.out.printf("cnd: %d, %c\n", cnt, ch);
            cnt++;
        }
    }
}
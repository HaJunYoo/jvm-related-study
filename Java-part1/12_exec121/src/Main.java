public class Main {
    public static void main(String[] args) {
        int total = 0;
        int cnt = 1;
        while(cnt <= 10) {
            total += cnt;
            cnt++;
        }
        System.out.println("Total(while): " + total);

        total = 0;
        for(int i = 1; i <= 10; ++i) {
            total += i;
        }
        System.out.println("Total(int): " + total);
    }
}
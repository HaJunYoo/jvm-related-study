public class Main {
    public static void main(String[] args) {
        String tmp = "0123456789";
        long begin = System.currentTimeMillis();
        for(int i = 0; i < 1024; ++i)
            tmp = tmp + "0123456789";
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");

        begin = System.currentTimeMillis();
        for(int i = 0; i < 1024 * 10; ++i)
            tmp = tmp + "0123456789";
        end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
}
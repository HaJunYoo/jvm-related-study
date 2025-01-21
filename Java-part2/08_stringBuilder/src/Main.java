public class Main {
    public static void main(String[] args) {
        String tmp = "0123456789";
        long begin = System.currentTimeMillis();
        for(int i = 0; i < 1024 * 10; ++i)
            tmp = tmp + "0123456789";
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - begin) + "ms");

        StringBuilder tmpBuilder = new StringBuilder("0123456789");
        begin = System.currentTimeMillis();
        for(int i = 0; i < 1024 * 100; ++i)
            tmpBuilder.append("0123456789");
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - begin) + "ms");
    }
}
public class Main {
    public static void main(String[] args) {
        String helloString = "hello";
        char[] hello = (char[])helloString;
        for (int i = 0; i < 5; i++) {
            hello[i] = helloString.charAt(i);
            System.out.printf("hello[%d]: %c\n", i, hello[i]);
        }
    }
}
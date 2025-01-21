public class Main {
    public static void main(String[] args) {
        char[] hello = new char[5];
        String helloString = "Hello";
        for (int i = 0; i < 5; i++) {
            hello[i] = helloString.charAt(i);
            System.out.printf("hello[%d]: %c\n", i, hello[i]);
        }
    }
}
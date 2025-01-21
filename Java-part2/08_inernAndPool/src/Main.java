public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);

        String s3 = new String("World");
        String s4 = s3.intern();
        System.out.println(s3 == s4);
        System.out.println("World" == s3);
        System.out.println("World" == s4);
    }
}
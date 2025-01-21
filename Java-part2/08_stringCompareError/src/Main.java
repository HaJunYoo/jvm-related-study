public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("");

        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.compareTo(s4) == 0);
    }
}
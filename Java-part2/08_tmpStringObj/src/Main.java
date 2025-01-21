public class Main {
    public static void main(String[] args) {
        String hello = "hello";
        hello += "World";
        System.out.println(hello);

        System.out.println(
                (hello + " TempObj").concat(" Test")
        );
    }
}
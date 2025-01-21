public class Main {
    public static void main(String[] args) {
        String tmp = "TestString";
        System.out.println(tmp.charAt(4));
        System.out.println(tmp.indexOf('S'));

        System.out.println(tmp.contains("ring"));
        System.out.println(tmp.indexOf("ring"));

        System.out.println(tmp.startsWith("test"));
        System.out.println(tmp.equalsIgnoreCase("testSTRING"));

        tmp = "\tTest  String  ";
        System.out.println(tmp.trim());
    }
}
public class Main {
    public static void main(String[] args) {
        Integer intObj = 128;
        Integer intObj2 = (int)128;
        int tmp = intObj;

        System.out.printf("%d\n", 128);
        System.out.println(String.valueOf(128));
        System.out.println(intObj.toString());
        System.out.println(Integer.valueOf("256"));

        System.out.println(128 == 128);
        System.out.println(intObj == intObj2);
    }
}
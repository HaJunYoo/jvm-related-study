public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 30, 40 , 50};
        try {
            array[0] = 100;
            System.out.println(array[0]);
            array[5] = 500;
            System.out.println("end of try {}");
        } catch (RuntimeException e) {
            System.out.println("ERROR: Runtime 예외발생");
        }
        finally {
            System.out.println("항상 실행");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(getFactorialLoop(5));
        System.out.println(getFactorial(5));
    }

    public static int getFactorialLoop(int param) {
        int total = 1;
        for (int i = 1; i <= param; i++)
            total *= i;
        return total;
    }

    public static int getFactorial(int param) {
        if(param == 1)
            return 1;

        int result = param * getFactorial(param - 1);
        return result;
    }
}
class MyException extends Exception {
    MyException(String param) {
        msg = param;
    }
    private String msg;
    public String getMsg() {
        return msg;
    }
}

public class Main {
    static void checkedTest() throws MyException {
        int input = 110;
        if(input < 0 || input > 100)
            throw new MyException("throw MyException");
    }

    static void caller() throws MyException {
        checkedTest();
    }

    public static void main(String[] args) {
        try {
            caller();
        }
        catch (MyException e) {
            System.out.println(e.getMsg());
        }
    }
}
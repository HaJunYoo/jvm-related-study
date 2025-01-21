class MyString {
    private byte[] string;
    private static int count;

    protected MyString() {
        string = null;
    }

    private MyString(String param) {
        string = param.getBytes();
    }

    private MyString(int param) {
        String tmp = String.format("%d", param);
        string = tmp.getBytes();
    }

    public MyString(MyString rhs) {
        count++;
        this.deepCopy(rhs);
    }

    public void deepCopy(MyString rhs) {
        this.string = rhs.string.clone();
    }

    public String getString() {
        if(string == null || string.length <= 0) {
            return "(null)";
        }

        return new String(string);
    }

    public void setString(String param) {
        String result = onSetString(param);
        string = result.getBytes().clone();
    }

    protected String onSetString(String param) {
        return param;
    }

    public int length() {
        if(string == null)
            return 0;
        return string.length;
    }

    public int compareTo(String param) {
        if(string == null)
            return -1;

        return param.compareTo(new String(string));
    }

    public static MyString newString(int param) {
        count++;
        return new MyString(param);
    }

    public static MyString newString(String param) {
        count++;
        if(param == null || param.length() <= 0)
            return new MyString("(null)");

        return new MyString(param);
    }

    public static int getCount() {
        return MyString.count;
    }

}

class MyStringEx extends MyString {
    public MyStringEx() {
    }

    @Override
    protected String onSetString(String param) {
        if(param.compareTo("멍멍이아들") == 0)
            param = "우리귀요미";
        return param;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStringEx str = new MyStringEx();
        str.setString("멍멍이아들");
        System.out.println(str.getString());
    }
}
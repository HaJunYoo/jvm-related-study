class MyString {
    private byte[] string;
    private static int count;

    private MyString() {
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
        string = param.getBytes().clone();
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

public class Main {
    public static void main(String[] args) {
        //MyString src = new MyString("Hello");
        MyString s1 = MyString.newString(10);
        MyString s2 = MyString.newString("Test");
        MyString s3 = new MyString(s1);

        System.out.println(s1.getString());
        System.out.println(s2.getString());
        System.out.println(MyString.getCount());
    }
}
class MyString {
    private byte[] string;
    MyString() {
        string = null;
    }

    public MyString(String param) {
        string = param.getBytes();
    }

    public MyString(int param) {
        String tmp = String.format("%d", param);
        string = tmp.getBytes();
    }

    public MyString(MyString rhs) {
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
}

public class Main {
    public static void main(String[] args) {
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);

        src.setString("World");
        System.out.println(dst.getString());
    }
}
class MyString {
    private byte[] string;
    MyString() {
        string = null;
    }

    MyString(String param) {
        string = param.getBytes();
    }

    MyString(int param) {
        String tmp = String.format("%d", param);
        string = tmp.getBytes();
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
        MyString str1 = new MyString("Test");
        System.out.println(str1.getString());
        MyString str2 = new MyString(512);
        System.out.println(str2.getString());
    }
}
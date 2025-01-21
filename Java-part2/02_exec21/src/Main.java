class MyString {
    private byte[] string;

    public String getString() {
        if(string == null || string.length <= 0) {
            return "(null)";
        }

        return new String(string);
    }
    public void setString(String param) {
        string = param.getBytes();
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
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }
}
class UserData {
    private String name;
    private int age;

    UserData() {
        System.out.println("UserData()");
    }

    UserData(String name, int age) {
        this();
        System.out.println("UserData(String, int)");
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        UserData user = new UserData("Hoon", 10);
    }
}
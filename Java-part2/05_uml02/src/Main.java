
class MyUi {
    private int input;
    private int menu;

    public UserData addNew() {
        return new UserData();
    }

    public UserData find(UserData user)
    {
        return new UserData();
    }
}

class UserData {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
import java.util.List;

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

class MyList {
    private List<UserData> list;

    UserData addNew() {
        return new UserData();
    }
}

class MyListEx extends MyList {
    private List<UserData> listDel;
    private int deleted;

    @Override
    UserData addNew() {
        return new UserData();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class UserData {
    UserData(String name, String addr, String phone) {
        this.name = name;
        info = new Address(addr, phone);
    }

    private String name;
    private Address info;

    public Address getInfo() {
        return info;
    }

    class Address {
        public Address(String addr, String phone) {
            this.addr = addr;
            this.phone = phone;
        }
        private String addr;
        private String phone;

        public String getUserInfo() {
            return UserData.this.name + ", " + addr + ", " + phone;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UserData user = new UserData(
                "Hosung", "Seoul", "010-1111-111");
        System.out.println(user.getInfo().getUserInfo());

        UserData.Address addr = user.new Address(
                "Hanam", "010-2222-2222");
        System.out.println(addr.getUserInfo());
    }
}
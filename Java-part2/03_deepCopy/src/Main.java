class Address {
    Address(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String address;
    public String phone;
}

class User {
    private String name;
    private Address address;

    User(String name, String address, String phone) {
        this.name = name;
        this.address = new Address(address, phone);
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void copy(User rhs) {
        this.name = rhs.name;
        //this.address = rhs.address;
        this.address.address = rhs.address.address;
        this.address.phone = rhs.address.phone;
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Hosung", "Hanam", "010-1111-1111");
        User user2 = new User("Hoon", "Seoul", "010-2222-2222");

        System.out.println(user1.getName());
        System.out.println(user1.getAddress().address);
        System.out.println(user1.getAddress().phone);

        user1.copy(user2);
        user2.getAddress().phone = "010-3333-3333";
        user2.getAddress().address = "Busan";

        System.out.println(user1.getName());
        System.out.println(user1.getAddress().address);
        System.out.println(user1.getAddress().phone);
    }
}
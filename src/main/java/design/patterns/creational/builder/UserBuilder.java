package design.patterns.creational.builder;

/**
 * @author durgesh.soni 2019-07-13
 */
public class UserBuilder {
    public String name;
    public String address;
    public long phoneNumber;
    public int age;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder phoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        User user = new User(this);
        validateUser();
        return user;
    }

    private void validateUser() {

    }
}

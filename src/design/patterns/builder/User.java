package design.patterns.builder;

/**
 * @author durgesh.soni 2019-07-13
 */
public class User {
    private String name;
    private String address;
    private long phoneNumber;
    private int age;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final String obj = ("\nName : " + this.name +
                " \nAddress : " + this.address +
                " \nAge : " + this.age +
                " \nPhoneNumber : " + this.phoneNumber
        );
        return obj;
    }

}

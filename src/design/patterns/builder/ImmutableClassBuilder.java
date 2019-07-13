package design.patterns.builder;

/**
 * @author durgesh.soni 2019-07-13
 * @link https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
 */
public class ImmutableClassBuilder {
    public static void main(String[] args) {
        User user = new UserBuilder().
                name("Durgesh").age(15).address("Raebareli").build();
        System.out.printf("User is : " + user.toString());
    }
}

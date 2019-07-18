package design.patterns.creational.prototype;

import design.patterns.creational.prototype.model.Book;
import design.patterns.creational.prototype.model.Company;
import design.patterns.creational.prototype.model.Movie;

import java.util.HashMap;
import java.util.Map;

/**
 * @author durgesh.soni 2019-07-13
 */
public class DemoPrototype {
    private static Map<String, BasePrototype> prototypeMap = new HashMap<>();

    static {
        prototypeMap.put(Book.CLAZZ, PrototypeFactory.getProtoTypeInstance(Book.CLAZZ));
        prototypeMap.put(Movie.CLAZZ, PrototypeFactory.getProtoTypeInstance(Movie.CLAZZ));
        prototypeMap.put(Company.CLAZZ, PrototypeFactory.getProtoTypeInstance(Company.CLAZZ));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DemoPrototype demo = new DemoPrototype();

        System.out.println(demo.getInstance(Book.CLAZZ).toString());
        System.out.println(demo.getInstance(Movie.CLAZZ).toString());
        System.out.println(demo.getInstance(Company.CLAZZ).toString());
    }

    private BasePrototype getInstance(String name) throws CloneNotSupportedException {
        return prototypeMap.get(name).clone();
    }
}

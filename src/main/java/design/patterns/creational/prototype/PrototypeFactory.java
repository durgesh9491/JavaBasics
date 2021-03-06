package design.patterns.creational.prototype;

import design.patterns.creational.prototype.model.Book;
import design.patterns.creational.prototype.model.Company;
import design.patterns.creational.prototype.model.Movie;

/**
 * @author durgesh.soni 2019-07-13
 */
public final class PrototypeFactory {
    public static BasePrototype getProtoTypeInstance(String name) {
        switch (name) {
            case Book.CLAZZ:
                return new Book();

            case Company.CLAZZ:
                return new Company();

            case Movie.CLAZZ:
                return new Movie();

            default:
                return null;
        }
    }
}

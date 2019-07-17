package design.patterns.prototype.model;

import design.patterns.prototype.BasePrototype;
import lombok.Data;

/**
 * @author durgesh.soni 2019-07-13
 */

@Data
public class Book implements BasePrototype {

    public static final String CLAZZ = "book";
    private String name;
    private int pages;
    private String publication;

    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return Book.CLAZZ;
    }
}

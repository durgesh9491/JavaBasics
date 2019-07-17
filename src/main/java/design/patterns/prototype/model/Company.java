package design.patterns.prototype.model;

import design.patterns.prototype.BasePrototype;
import lombok.Data;

/**
 * @author durgesh.soni 2019-07-13
 */

@Data
public class Company implements BasePrototype {
    public static final String CLAZZ = "company";
    private String name;
    private int stockValue;

    public Company clone() throws CloneNotSupportedException {
        return (Company) super.clone();
    }

    @Override
    public String toString() {
        return Company.CLAZZ;
    }
}

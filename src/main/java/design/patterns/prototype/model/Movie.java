package design.patterns.prototype.model;

import design.patterns.prototype.BasePrototype;
import lombok.Data;

/**
 * @author durgesh.soni 2019-07-13
 */

@Data
public class Movie implements BasePrototype {
    public static final String CLAZZ = "movie";
    private String name;
    private int ratings;

    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return Movie.CLAZZ;
    }
}

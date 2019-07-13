package design.patterns.prototype.model;

import design.patterns.prototype.BasePrototype;

/**
 * @author durgesh.soni 2019-07-13
 */
public class Movie implements BasePrototype {
    public static final String CLAZZ = "movie";
    private String name;
    private int ratings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return Movie.CLAZZ;
    }
}

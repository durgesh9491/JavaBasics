package design.patterns.prototype.model;

import design.patterns.prototype.BasePrototype;

/**
 * @author durgesh.soni 2019-07-13
 */
public class Book implements BasePrototype {

    public static final String CLAZZ = "book";
    private String name;
    private int pages;
    private String publication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return Book.CLAZZ;
    }
}

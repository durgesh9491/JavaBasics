package design.patterns.prototype.model;

import design.patterns.prototype.BasePrototype;

/**
 * @author durgesh.soni 2019-07-13
 */
public class Company implements BasePrototype {
    public static final String CLAZZ = "company";
    private String name;
    private int stockValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockValue() {
        return stockValue;
    }

    public void setStockValue(int stockValue) {
        this.stockValue = stockValue;
    }

    public Company clone() throws CloneNotSupportedException {
        return (Company) super.clone();
    }

    @Override
    public String toString() {
        return Company.CLAZZ;
    }
}

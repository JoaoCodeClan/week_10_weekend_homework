package models;

public class Bread extends Item {
    private String size;

    public Bread( String name, double price, String size){
        super(name, price);
        this.size= size;
    }

    public String getSize() {
        return this.size;
    }
}

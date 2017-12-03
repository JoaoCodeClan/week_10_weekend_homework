package models;

public class Eggs extends Item {
    private String type;

    public Eggs(String name, double price, String type){
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String newType) {
        this.type = newType;
    }
}

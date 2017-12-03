package models;

public class PastaSauce extends Item {

    private String flavour;


    public PastaSauce(String name,double price, String flavour){
        super(name, price);
        this.flavour= flavour;

    }
    
}

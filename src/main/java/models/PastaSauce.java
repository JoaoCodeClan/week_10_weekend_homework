package models;

import Interfaces.BuyOneGetOneFree;

public class PastaSauce extends Item implements BuyOneGetOneFree {

    private String flavour;


    public PastaSauce(String name,double price, String flavour){
        super(name, price);
        this.flavour= flavour;

    }

    public String getFlavour() {
        return this.flavour;
    }

    public void setFlavour(String newFlavour) {
        this.flavour = newFlavour;
    }
}

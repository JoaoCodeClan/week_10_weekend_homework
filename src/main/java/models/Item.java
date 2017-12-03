package models;

import Interfaces.Sellable;

public abstract class Item implements Sellable {
    private String name;
    private double price;

    public Item( String name, double price){
        this.name = name;
        this.price = price;
    }


}

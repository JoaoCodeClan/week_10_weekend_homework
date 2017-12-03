package models;

import Interfaces.Sellable;

import java.util.ArrayList;

public class ShoppingBasket {
     private ArrayList<Sellable> contentShoppingBasket;

    public ShoppingBasket(){
        this.contentShoppingBasket = new ArrayList<>();
    }


    public int getAmountItems() {
        return contentShoppingBasket.size();
    }
}

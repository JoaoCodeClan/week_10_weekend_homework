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

    public void addItem(Sellable item) {
        contentShoppingBasket.add(item);
    }

    public boolean findItem(Sellable item) {
        return contentShoppingBasket.contains(item);
    }
}

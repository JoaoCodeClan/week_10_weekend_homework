package models;

import Interfaces.BuyOneGetOneFree;
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
        if(item instanceof BuyOneGetOneFree){
        contentShoppingBasket.add(item);
        contentShoppingBasket.add(item);
        }
        else {
            contentShoppingBasket.add(item);
        }


    }

    public boolean findItem(Sellable item) {
        return contentShoppingBasket.contains(item);
    }

    public void removeItem(Sellable item) {
        contentShoppingBasket.remove(item);
    }

    public void emptyBasket() {
        contentShoppingBasket.clear();
    }

    public double getTotal() {
        double total = 0;
        for (Sellable item : contentShoppingBasket) {
            if (item instanceof BuyOneGetOneFree) {
                total += (item.getPrice()/2);
            } else {
                total += item.getPrice();

            }

        }
        return total;
    }

}

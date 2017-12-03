package models;

import Interfaces.Sellable;

public class Client {
    private LoyaltyCard loyaltyCard;
    private ShoppingBasket shoppingBasket;

    public Client(LoyaltyCard loyaltyCard){
        this.loyaltyCard= loyaltyCard;
        this.shoppingBasket= new ShoppingBasket();

    }

    public boolean checkForLoyaltyCard() {
        if(this.loyaltyCard == LoyaltyCard.YES){
            return true;
        }
        else {
            return false;
        }

    }

    public int countItemsInBasket() {
        return this.shoppingBasket.getAmountItems();
    }

    public void buyItem(Sellable item) {
        shoppingBasket.addItem(item);
    }
}

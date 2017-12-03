package models;

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
}

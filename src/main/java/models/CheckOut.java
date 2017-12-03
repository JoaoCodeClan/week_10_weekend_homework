package models;

public class CheckOut {
    private Client client;


    public CheckOut(Client client){
        this.client = client;
    }

    public void proceedCheckOut() {
        double totalExpense = 0;
        if (this.client.getBasketTotal() >= 20 && this.client.checkForLoyaltyCard() == true) {
            double discount = client.getBasketTotal() - (client.getBasketTotal() * 0.1);
            double discount1 = discount - (discount * 0.02);
            totalExpense += discount1;
        }
        else if (this.client.getBasketTotal() >= 20 && this.client.checkForLoyaltyCard() == false) {
            double discount = client.getBasketTotal() - (client.getBasketTotal() * 0.1);
            totalExpense += discount;
        }
        else if (this.client.getBasketTotal() < 20 && this.client.checkForLoyaltyCard() == true) {
            double discount = client.getBasketTotal() - (client.getBasketTotal() * 0.02);
            totalExpense += discount;
        }
        else {
            totalExpense += client.getBasketTotal();
        }
        this.client.setBill(totalExpense);
    }
}

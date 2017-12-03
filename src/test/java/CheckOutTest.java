import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckOutTest {
    CheckOut checkout;
    CheckOut checkout1;
    Client client;
    Client client1;
    Eggs item1;
    Bread item2;
    PastaSauce item3;


    @Before

    public void before(){

        client= new Client(LoyaltyCard.YES);
        client1= new Client(LoyaltyCard.NO);
        checkout= new CheckOut(client);
        checkout1= new CheckOut(client1);
        item1= new Eggs("Margaret's", 20.0, "Free Range");
        item2= new Bread("Bloomer", 3.5, "medium");
        item3= new PastaSauce("Toni's", 5.0, "BitterSweet");
    }



    @Test

    public void canGetTotalAndSetBillForClientWithExpensesOver20AndLoyaltyCard(){
        client.buyItem(item1);
        client.buyItem(item3);
        checkout.proceedCheckOut();
        double actual = client.getBill();
        assertEquals(22.05, actual, 0.01);

    }

    @Test

    public void canGetTotalAndSetBillForClientWithExpensesOver20AndNoLoyaltyCard(){
        client1.buyItem(item1);
        client1.buyItem(item3);
        checkout1.proceedCheckOut();
        double actual = client1.getBill();
        assertEquals(22.5, actual, 0.01);

    }

    @Test

    public void canGetTotalAndSetBillForClientWithExpensesBellow20AndWithLoyaltyCard(){
        client.buyItem(item3);
        checkout.proceedCheckOut();
        double actual = client.getBill();
        assertEquals(4.9, actual, 0.01);

    }

    @Test

    public void canGetTotalAndSetBillForClientWithExpensesBellow20AndWithoutLoyaltyCard(){
        client1.buyItem(item2);
        checkout1.proceedCheckOut();
        double actual = client1.getBill();
        assertEquals(3.5, actual, 0.01);

    }




}

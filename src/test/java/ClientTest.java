import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClientTest {

    Client client ;
    Client client1 ;
    Eggs item1;
    Bread item2;
    PastaSauce item3;



    @Before

    public void before(){

        client= new Client(LoyaltyCard.YES);
        client1= new Client(LoyaltyCard.NO);
        item1= new Eggs("Margaret's", 2.0, "Free Range");
        item2= new Bread("Bloomer", 3.5, "medium");
        item3= new PastaSauce("Toni's", 5.0, "BitterSweet");
    }


    @Test

    public void canCheckIfClientHasLoyaltyCard(){
        boolean actual =client.checkForLoyaltyCard();
        assertTrue(actual);
        boolean actual1 = client1.checkForLoyaltyCard();
        assertFalse(actual1);
    }

    @Test
    public void clientStartsWithEmptybasket(){
        assertEquals(0, client.countItemsInBasket());
    }

    @Test
    public void canGetClientBill(){
        assertEquals(0, client.getBill(), 0.01);
    }


    @Test

    public void clientCanAddItemsToBasket(){
        client.buyItem(item1);
        client.buyItem(item3);
        int actual = client.countItemsInBasket();
        assertEquals(3, actual);

    }

    @Test

    public void clientCanRemoveItemsFromBasket(){
        client.buyItem(item1);
        client.buyItem(item3);
        client.putBackItem(item1);
        int actual = client.countItemsInBasket();
        assertEquals(2, actual);
    }

    @Test
    public void clientCanGetTotalOfBasket(){
        client.buyItem(item1);
        client.buyItem(item3);
        double actual = client.getBasketTotal();
        assertEquals(7.0, actual, 0.01);
    }
}

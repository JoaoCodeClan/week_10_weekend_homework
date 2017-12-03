import models.Client;
import models.LoyaltyCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClientTest {

    Client client ;
    Client client1 ;


    @Before

    public void before(){

        client= new Client(LoyaltyCard.YES);
        client1= new Client(LoyaltyCard.NO);
    }


    @Test

    public void canCheckIfClientHasLoyaltyCard(){
        boolean actual =client.checkForLoyaltyCard();
        assertTrue(actual);
        boolean actual1 = client1.checkForLoyaltyCard();
        assertFalse(actual1);
    }
}

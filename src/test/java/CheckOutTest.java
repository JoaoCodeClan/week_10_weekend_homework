import models.*;
import org.junit.Before;
import org.junit.Test;

public class CheckOutTest {

    Client client;
    Client client1;
    Client client2;
    Eggs item1;
    Bread item2;
    PastaSauce item3;


    @Before

    public void before(){

        client= new Client(LoyaltyCard.YES);
        client1= new Client(LoyaltyCard.NO);
        client2= new Client(LoyaltyCard.YES);
        item1= new Eggs("Margaret's", 20.0, "Free Range");
        item2= new Bread("Bloomer", 3.5, "medium");
        item3= new PastaSauce("Toni's", 5.0, "BitterSweet");
    }





}

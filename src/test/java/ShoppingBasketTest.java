import models.ShoppingBasket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket basket;

    @Before

    public void before(){
        basket= new ShoppingBasket();
    }

    @Test

    public void ShoppingBasketStartsEmpty(){

        assertEquals(0, basket.getAmountItems());
    }
}

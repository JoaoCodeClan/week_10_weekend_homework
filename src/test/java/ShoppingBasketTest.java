import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShoppingBasketTest {

    ShoppingBasket basket;
    Eggs item1;
    Bread item2;
    PastaSauce item3;

    @Before

    public void before(){
        basket= new ShoppingBasket();
        item1= new Eggs("Margaret's", 2.0, "Free Range");
        item2= new Bread("Bloomer", 3.5, "medium");
        item3= new PastaSauce("Toni's", 5.0, "BitterSweet");
    }

    @Test

    public void ShoppingBasketStartsEmpty(){

        assertEquals(0, basket.getAmountItems());
    }

    @Test

    public void canAddItem(){
        basket.addItem(item1);
        assertEquals(1, basket.getAmountItems());
    }

    @Test

    public void canFindItemInBasket(){
        basket.addItem(item1);
        boolean actual = basket.findItem(item1);
        assertTrue(actual);

    }

    @Test

    public void cannotFindItemInBasket(){
        basket.addItem(item1);
        boolean actual = basket.findItem(item2);
        assertFalse(actual);

    }

}

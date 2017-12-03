import models.PastaSauce;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PastaSauceTest {

    PastaSauce sauce;


    @Before

    public void before(){
        sauce = new PastaSauce("Toni's", 5.0, "BitterSweet");
    }

//    Will not test getters and setters for name and price due to inhaeretance and have been tested in eggstest

    @Test

    public void canGetFlavour(){
        assertEquals("BitterSweet",sauce.getFlavour());
    }

    @Test
    public void canSetFlavour(){
        sauce.setFlavour("Salty");
        assertEquals("Salty", sauce.getFlavour());
    }
}

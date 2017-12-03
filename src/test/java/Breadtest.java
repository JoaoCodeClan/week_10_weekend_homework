import models.Bread;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Breadtest {

    Bread bread;


    @Before

    public void before(){
        bread = new Bread( "Bloomer", 3.5, "medium");
    }


//    Will not test getters and setters for name and price as they are inhereted and have been tested in Eggstest;

    @Test

    public void canGetSize(){
        assertEquals("medium", bread.getSize());
    }

    @Test

    public void canSetSize(){
        bread.setSize("huge");
        assertEquals("huge", bread.getSize());
    }

}

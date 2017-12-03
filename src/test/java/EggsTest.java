import models.Eggs;
import models.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EggsTest {

    Eggs eggs;

    @Before

    public void before(){

        eggs= new Eggs("Margaret's", 2.0, "Free Range");

    }

@Test

    public void canGetName(){
        assertEquals("Margaret's", eggs.getName());
}

@Test

    public void canSetname(){
        eggs.setName("Henrietta's");
        assertEquals("Henrietta's", eggs.getName());
}
}

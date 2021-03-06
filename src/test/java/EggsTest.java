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

@Test

    public void canGetPrice(){
        assertEquals(2.0, eggs.getPrice(), 0.01);
}


@Test

    public void canSetPrice(){
        eggs.setPrice(4.0);
        assertEquals(4.0, eggs.getPrice(), 0.01);
}

@Test

    public void canGetType(){
        assertEquals("Free Range", eggs.getType());
}


@Test

    public void canSetType(){
     eggs.setType("Mixed");
     assertEquals("Mixed", eggs.getType());
}

}

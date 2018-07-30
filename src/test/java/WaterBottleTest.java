import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle newBottle;

    @Before
    public void before(){
        newBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, newBottle.getVolume());
    }

    @Test
    public void canDrink(){
        newBottle.drink();
        assertEquals(90, newBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        newBottle.empty();
        assertEquals(0, newBottle.getVolume());
    }



}

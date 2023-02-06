import org.example.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle chillies;
    @Before
    public void setUp () {
        chillies = new WaterBottle();
    }
    @Test
    public void hasVolume () {
        assertEquals(100, chillies.getVolume());
    }
    @Test
    public void canDrink () {
        chillies.drink();
        assertEquals(90, chillies.getVolume());
    }
    @Test
    public void canEmpty () {
        chillies.empty();
        assertEquals(0, chillies.getVolume());
    }
    @Test
    public void canFill () {
        chillies.empty();
        chillies.fill();
        assertEquals(100, chillies.getVolume());
    }
}

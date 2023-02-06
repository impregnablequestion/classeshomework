import org.example.Printer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer epsom;
    @Before
    public void setUp () {
        epsom = new Printer();
    }
    @Test
    public void hasPaperLeft () {
        assertEquals(25, epsom.getPaperLeft());
    }
    @Test
    public void canPrint () {
        epsom.print(8, 2);
        assertEquals(9, epsom.getPaperLeft());
    }
    @Test
    public void hasToner () {
        assertEquals(100, epsom.getToner());
    }
    @Test
    public void tonerReducesWhenPrints () {
        epsom.print(6, 3);
        assertEquals(82, epsom.getToner());
    }
    @Test
    public void noPrintWithoutPaper () {
        epsom.print(20, 2);
        assertEquals(25, epsom.getPaperLeft());
    }
    @Test
    public void noPrintWithoutToner () {
        epsom.setToner(1);
        epsom.print(2, 1);
        assertEquals(25, epsom.getPaperLeft());
    }
}

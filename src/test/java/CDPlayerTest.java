import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer walkman;
    @Before
    public void before(){
        walkman=new CDPlayer("Sony","Walkman");
    }
    @Test
    public void canGetMake(){
        assertEquals("Sony",walkman.getMake());
    }
    @Test
    public void canGetModel(){
        assertEquals("Walkman",walkman.getModel());
    }
    @Test
    public void canGetTrack(){
        assertEquals(1,walkman.getTrack());
    }
    @Test
    public void canAdvanceTrack(){
        assertEquals(1,walkman.getTrack());
        walkman.advanceTrack();
        assertEquals(2,walkman.getTrack());
    }
    @Test
    public void canReverseTrack(){
        assertEquals(1,walkman.getTrack());
        walkman.reverseTrack();
        assertEquals(0,walkman.getTrack());
    }
}
import org.junit.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;


public class AdderTest {
    @Test
    public void addIntTest(){
        Adder add = new Adder();
        int sum = add.add(1,1);
        assertEquals(2, sum);
    }

}

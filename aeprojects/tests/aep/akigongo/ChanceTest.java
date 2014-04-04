package aep.akigongo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by aisha on 2/7/14.
 */
public class ChanceTest {
    @Test
    public void testNot() throws Exception {
        Chance probability = new Chance(0.25);
        assertEquals(new Chance(0.75), probability.not());

    }

    @Test
    public void testAnd() throws Exception {
        assertEquals(new Chance(0.25), Chance.and(new Chance(0.5), new Chance(0.5)));
    }

    @Test
    public void testEquals() throws Exception {
        Chance coinToss = new Chance(0.5);
        Chance dieThrow = new Chance((double) (0.7));
        //assertFalse(dieThrow.equals(coinToss));
        assertEquals(new Chance(0.5), coinToss);
        assertEquals(new Chance(0.5), coinToss.not());
        Map<Chance, String>map = new HashMap();
        map.put(new Chance(0.5), "coin Toss");

    }
    // construct two instances
    // construct objects within it
    //P(A || B) = !(!(P(A)) && !(P(A)))
    //P(A && B) = !(!(P(A)) || !(P(A)))
    // Avoid using extra code where it is not needed
    // Add Tests for chance
}

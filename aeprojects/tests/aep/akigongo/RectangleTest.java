package aep.akigongo;

import static org.junit.Assert.assertEquals;

/**
 * Created by aisha on 2/7/14.
 */
public class RectangleTest {
    public void shouldBeAbleToCreateSquare(){
    assertEquals(25, Rectangle.createSquare(5));
    }
}

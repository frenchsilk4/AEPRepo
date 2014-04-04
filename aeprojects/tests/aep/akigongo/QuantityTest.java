package aep.akigongo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by aisha on 2/9/14.
 */
public class QuantityTest {

    //@Test
    /*public void testConvertFeetToYard() throws Exception {
        assertEquals(new ArithmeticQuantity(Unit.YARDS, 1.0), new ArithmeticQuantity(Unit.FEET, 3));
        assertEquals(new ArithmeticQuantity(Unit.YARDS, 1760), new ArithmeticQuantity(Unit.MILES, 1));
    }

    @Test(expected = RuntimeException.class)
    public void testMismatchRaiseException() throws RuntimeException {
        assertEquals(new ArithmeticQuantity(Unit.TEASPOONS, 1).add(
                new ArithmeticQuantity(Unit.INCHES, 1)),new ArithmeticQuantity(Unit.INCHES, 2));
    }

    @Test
    public void arithmeticGreaterThan(){
        ArithmeticQuantity quantity = new ArithmeticQuantity(Unit.FEET,4);
        assertTrue(quantity.greaterThan(new ArithmeticQuantity(Unit.FEET,3)));
    }

    @Test
    public void arithmeticGreaterThanForDifferentUnits(){
        ArithmeticQuantity quantity = new ArithmeticQuantity(Unit.YARDS,4);
        assertTrue(quantity.greaterThan(new ArithmeticQuantity(Unit.FEET,3)));
    }

    @Test(expected = RuntimeException.class)
    public void comparisonShouldFailForIncomparableUnits(){
        ArithmeticQuantity quantity = new ArithmeticQuantity(Unit.YARDS,4);
        assertTrue(quantity.greaterThan(new ArithmeticQuantity(Unit.CUPS,3)));
    }
*/
    //HOMEWORK
    // JOSH - refactoring
    // Industrial Logic : Acceptance testing in development
    // come up with a solution for best quantity. Given a series of quantities what is the best quantity

    @Test
    public void returnBestQuantityTestInSeriesofSameUnit(){
        ArrayList<ArithmeticQuantity> myList = new ArrayList<ArithmeticQuantity>();
        myList.add(new ArithmeticQuantity(Unit.YARDS,5));
        myList.add(new ArithmeticQuantity(Unit.YARDS,8));
        myList.add(new ArithmeticQuantity(Unit.YARDS,2));
        Collections.sort(myList,ArithmeticQuantity.ArithmeticQuantityComparator);
        assertEquals(new ArithmeticQuantity(Unit.YARDS, 8), myList.get(2));

    }
    @Test
    public void BestQuantityTestInSeriesofLengthUnit(){
        ArrayList<ArithmeticQuantity> myList = new ArrayList<ArithmeticQuantity>();
        myList.add(new ArithmeticQuantity(Unit.FEET,15));
        myList.add(new ArithmeticQuantity(Unit.YARDS,8));
        myList.add(new ArithmeticQuantity(Unit.YARDS,2));
        Collections.sort(myList,ArithmeticQuantity.ArithmeticQuantityComparator);
        assertEquals(new ArithmeticQuantity(Unit.YARDS, 8), myList.get(2));

    }

    @Test(expected = RuntimeException.class)
    public void BestQuantityTestInSeriesofMixedUnit(){
        ArrayList<ArithmeticQuantity> myList = new ArrayList<ArithmeticQuantity>();
        myList.add(new ArithmeticQuantity(Unit.YARDS,5));
        myList.add(new ArithmeticQuantity(Unit.YARDS,7));
        myList.add(new ArithmeticQuantity(Unit.CUPS, 2)); 
        Collections.sort(myList, ArithmeticQuantity.ArithmeticQuantityComparator);

        assertEquals(new ArithmeticQuantity(Unit.YARDS, 8), myList.get(2));

    }
}

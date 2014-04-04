package aep.akigongo;

import java.util.Comparator;

/**
 * Created by aisha on 2/21/14.
 * Undersstands unit and value for measurement
 * implements Bestable<ScaledQuantity></ScaledQuantity>
 */
public class ScaledQuantity implements Bestable<ScaledQuantity> {
    protected Unit unit;
    protected double value;

    public ScaledQuantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }


    @Override
    public boolean equals(Object other){
        if (other == this) return true;
        if (!(other instanceof ArithmeticQuantity)) return false;
        ArithmeticQuantity otherArithmeticQuantity = (ArithmeticQuantity) other;
        double otherValue = otherArithmeticQuantity.unit.convertTo(otherArithmeticQuantity.value, this.unit);
        return this.value == otherValue;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString(){
        return value + "";
    }

    @Override
    public boolean betterThan(ScaledQuantity other) {
        //double otherSize = other.convertTo(this.unit);
        //return this.size > otherSize;
        // In java you can only extend one class
        return false;
    }
}

// In have you can only extend one class
// Grand parent test : otherwise use interfaces
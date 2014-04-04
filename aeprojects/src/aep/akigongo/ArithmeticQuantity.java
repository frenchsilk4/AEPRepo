package aep.akigongo;

import java.util.ArrayList;
import java.util.Comparator;

// Understands unit equivalence
public class ArithmeticQuantity extends ScaledQuantity{


    public ArithmeticQuantity(Unit unit, double value){
        super(unit, value);

    }

    //ADD METHOD in Measurement
    public ArithmeticQuantity add(ArithmeticQuantity otherMeasurement) throws RuntimeException {

        // check if the units are convertible and add them together
        if(this.unit.toString() != otherMeasurement.unit.toString()) {
            throw new RuntimeException("unit mismatch");
        }
        double otherValue = otherMeasurement.unit.convertTo(otherMeasurement.value, this.unit);
        double sum = this.value + otherValue;
        return new ArithmeticQuantity(this.unit,sum);

        // return new ArithmeticQuantity(size + other.convertTo(units),units);
    }

    public boolean greaterThan(ArithmeticQuantity arithmeticQuantity) {
        boolean isIt = false;
        if(this.unit.isCompartibleType(arithmeticQuantity.unit))
        {
            double otherValue = arithmeticQuantity.unit.convertTo(arithmeticQuantity.value, this.unit);
            System.out.println("initial value is: " +this.value);
            System.out.println("converted value is: " +otherValue);
            return isIt = this.value > otherValue;
        }
        else {
            System.out.println("Error");
            throw new RuntimeException("unit type mismatch");
        }

       //return  isIt;
        //return false;
    }
    @Override
    public String toString(){
        return "";
    }
    public static Comparator<ArithmeticQuantity> ArithmeticQuantityComparator = new Comparator<ArithmeticQuantity>() {
        @Override
        public int compare(ArithmeticQuantity o1, ArithmeticQuantity o2) {

            //return (int) (val1 - val2);
            if(o1.greaterThan(o2)){
                System.out.println("Greater");
                return 1;
            }
            else {
                System.out.println("less");
                return -1;
            }
        }
    };

}
package aep.akigongo;

// understands how to convert between different types of quantity
public class Unit {
    public enum UnitType { LENGTH, VOLUME, TEMPERATURE };

    public static final Unit INCHES = new Unit(1.0/12,0, "Inches", UnitType.LENGTH);
    public static final Unit FEET = new Unit(1,0, "Feet", UnitType.LENGTH );
    public static final Unit YARDS = new Unit(3,0,"Yards", UnitType.LENGTH);
    public static final Unit MILES = new Unit(1760*3,0, "Miles", UnitType.LENGTH);

    public static final Unit TEASPOONS = new Unit(1,0, "Teaspoons", UnitType.VOLUME);
    public static final Unit TABLESPOONS = new Unit(3,0, "Tablespoons", UnitType.VOLUME);
    public static final Unit OUNCES = new Unit(2*3,0, "Ounces", UnitType.VOLUME);
    public static final Unit CUPS = new Unit(2*3*8,0,"Cups", UnitType.VOLUME);
    //public static final Unit CUPS = new Unit((5/9),-32, "Farenheit", UnitType.TEMPERATURE);


    //private final int offset;
    private final UnitType type;
    private final double conversionFactor;
    private final String name;
    private final double shift;

    //included a shift value for the functions

    @Override
    public String toString() {
        return name;
    }

    public Unit(double conversionFactor, double shift, String name, UnitType type) {
        this.conversionFactor = conversionFactor;
        this.name = name;
        this.type = type;
        this.shift = shift;
    }

    public double convertTo(double size, Unit otherUnit) throws RuntimeException{
        if(this.type != otherUnit.type)
        {
            throw new RuntimeException();
        }
        return ((size+shift) * conversionFactor) / otherUnit.conversionFactor;
    }

    //check for the unittype at this step.
    public boolean isCompartibleType(Unit otherUnit){

        System.out.println(otherUnit.name + " "+ this.name);

        return this.type.equals(otherUnit.type);

    }
}

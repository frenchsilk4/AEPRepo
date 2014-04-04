package aep.akigongo;

/**
 * Created by aisha on 2/6/14.
 */

public class Chance implements Bestable<Chance> {
    private final double prob;
    //private double probA;
    //private double probB;
    // BigDecimal type

    public Chance(double prob) {
        this.prob = prob;
    }

    public Chance not() {
        return new Chance(1-prob);
    }

    public static Chance and(Chance probA, Chance probB){
        /* P(A n B) = P(A)*P(B) */
        return new Chance(probA.prob * probB.prob);
    }

    @Override
    public boolean equals(Object other){
        if (other == this) return true;
        if (!(other instanceof Chance)) return false;
        return this.prob == ((Chance) other).prob;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public boolean betterThan(Chance other) {
        return prob > other.prob;
        //return false;
    }
}
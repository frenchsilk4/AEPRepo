package aep.akigongo;

import java.util.Comparator;

/**
 * Created by aisha on 3/6/14.
 * Finds the biggest out of the possible options
 */
public class BestQuantityComparator {

    private final  Bestable[] thingsToCompare;
    public BestQuantityComparator(Bestable... thingsToCompare){
        if(thingsToCompare == null) throw new NullPointerException();
        this.thingsToCompare = thingsToCompare;
    }

    public Bestable best(){
        Bestable champion = thingsToCompare[0];
        for(int i=1; i<thingsToCompare.length;i++){
            Bestable challenger = thingsToCompare[i];
            if(challenger.betterThan(champion)){
                champion = challenger;
            }
        }
        return champion;
    }


}

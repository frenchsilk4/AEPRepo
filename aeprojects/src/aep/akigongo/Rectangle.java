package aep.akigongo;

/**
 * Created by aisha on 2/7/14.
 */
public class Rectangle {
    private  final int height;
    private final int width;

    public static Rectangle createSquare(int side){
        return new Rectangle(side,side);
    }

    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int area(){
        return height * width;

    }
}

// static instances : controls how many instances created/ allow caching
// static instances : good way for encapsulation since they reduce coding for constructors etc
// factory method is a static method that returns an instance of the object
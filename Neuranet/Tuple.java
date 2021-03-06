package Neuranet;

/**
 * Class that represents a pair of objects
 * of any type.
 * @author Nolan Bridges
 * @version 1.0.0
 */
public class Tuple<X, Y> {
    /** The first object. */
    public final X x;
    /** The second object. */
    public final Y y;
    
    /**
     * Constructs tuple object.
     * @param f the first object.
     * @param s the second object.
     */
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}

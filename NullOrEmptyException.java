
package circulararray;

/**
 * An exception for when an object is null or empty when it shouldn't be.
 * @author matt roberts
 */
public class NullOrEmptyException extends Exception{

    /**
     * Creates a NullOrEmptyException
     */
    public NullOrEmptyException() {
    }

    /**
     * Creates a NullOrEmptyException with a message of your choosing.
     * @param message the message
     */
    public NullOrEmptyException(String message) {
        super(message);
    }
    
}

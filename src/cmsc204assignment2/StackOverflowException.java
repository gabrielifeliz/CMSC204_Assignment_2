package cmsc204assignment2;

/**
 * This exception is thrown when a push method is called on a full stack.
 * @author Gabriel I Feliz
 */
public class StackOverflowException extends RuntimeException {
    
    /**
     * No-arg constructor with default message for stack overflow
     */
    public StackOverflowException() {
        super("The empty is full");
    }
}

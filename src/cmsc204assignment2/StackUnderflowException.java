package cmsc204assignment2;

/**
 * This exception is thrown when a pop or peek method is called on an empty stack.
 * @author Gabriel I Feliz
 */
public class StackUnderflowException extends RuntimeException {
    
    /**
     * No-arg constructor with default message for stack underflow
     */
    public StackUnderflowException() {
        super("The stack is empty");
    }
}

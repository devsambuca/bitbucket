package Task1;

/**
 * @author Fominykh Vladimir
 */
public class ParametrException extends Exception {
    public ParametrException() {
    }

    public ParametrException(String message) {
        super(message);
    }

    public ParametrException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParametrException(Throwable cause) {
        super(cause);
    }

    public ParametrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

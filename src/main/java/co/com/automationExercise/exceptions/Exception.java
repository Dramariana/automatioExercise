package co.com.automationExercise.exceptions;


public class Exception extends AssertionError {
    public static final String PAGE_ERROR_MESSAGE = "cant load the page";

    public Exception(String message, Throwable cause) {
        super(message, cause);
    }

}

package co.com.automationpractice.exceptions;

public class ExceptionError extends AssertionError{
    public ExceptionError(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}

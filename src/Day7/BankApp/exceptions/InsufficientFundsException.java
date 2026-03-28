package Day7.BankApp.exceptions;

public class InsufficientFundsException extends BankAppException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

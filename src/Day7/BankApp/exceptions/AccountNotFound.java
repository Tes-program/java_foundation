package Day7.BankApp.exceptions;

public class AccountNotFound extends BankAppException {
    public AccountNotFound(String message) {
        super(message);
    }
}

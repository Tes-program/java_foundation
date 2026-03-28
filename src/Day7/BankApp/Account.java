package Day7.BankApp;

import Day7.BankApp.exceptions.InsufficientFundsException;
import Day7.BankApp.exceptions.InvalidAmountException;
import Day7.BankApp.exceptions.InvalidPinException;

import java.math.BigDecimal;

public class Account {

    private String name;
    private BigDecimal balance;
    private int number;
    private String pin;


    public Account(String name, String pin, int number) {
        this.name = name;
         this.pin = pin;
         this.number = number;
         this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
        balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount, String pin) {
        if (!this.pin.equals(pin)) {
            throw new InvalidPinException("Incorrect PIN. Withdrawal denied.");
        }
        if (amount.compareTo(balance) > 0) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance = this.balance.subtract(amount);
    }

    public void updatePin(String oldPin, String newPin) throws InvalidPinException {
        if (!this.pin.equals(oldPin)) {
            throw new InvalidPinException("Incorrect PIN. Cannot update PIN.");
        }
        this.pin = newPin;
    }

    public BigDecimal checkBalance(String pin) throws InvalidPinException {
        if (!this.pin.equals(pin)) {
            throw new InvalidPinException("Incorrect PIN. Cannot check balance.");
        }
        return balance;
    }

    public int getAccountNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }
}

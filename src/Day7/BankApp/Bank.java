package Day7.BankApp;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;
    private int nextAccountNumber;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1000;
    }

    public Account createAccount(String name, String pin) {
        Account newAccount = new Account(name, pin, nextAccountNumber++);
        accounts.add(newAccount);
        return newAccount;
    }

    public void deposit(int accountNumber, BigDecimal amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
        return;
    }

    public void withdraw(int accountNumber, BigDecimal amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
        return;
    }

    public BigDecimal checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public void transfer (int fromAccountNumber, int toAccountNumber, BigDecimal amount) {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        fromAccount.withdraw(amount, fromAccount.getPin());
        toAccount.deposit(amount);
    }

    private Account findAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                return accounts.get(i);
            }
        }
        try {
            throw new AccountNotFoundException("Account number " + accountNumber + " was not found.");
        } catch (AccountNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }
}

package BankApp;

import Day7.BankApp.Account;
import Day7.BankApp.Bank;
import Day7.BankApp.exceptions.InsufficientFundsException;
import Day7.BankApp.exceptions.InvalidAmountException;
import Day7.BankApp.exceptions.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank("First Bank");
    }

    @Test
    public void bank_ShouldHave_CorrectName() {
        assertEquals("First Bank", bank.getName());
    }

    @Test
    public void shouldCreate_Account_Successfully() {
        Account account = bank.createAccount("Teslim Odumuyiwa", "1234");
        assertNotNull(account);
        assertEquals("Teslim Odumuyiwa", account.getName());
    }

    @Test
    public void createdAccount_ShouldHave_ZeroBalance() {
        Account account = bank.createAccount("Teslim Odumuyiwa", "1234");
        assertEquals(BigDecimal.ZERO, bank.checkBalance(account.getAccountNumber(), "1234"));
    }

    @Test
    public void firstAccountNumber_ShouldBeOne_Thousand() {
        Account account = bank.createAccount("Teslim Odumuyiwa", "1234");
        assertEquals(1000, account.getAccountNumber());
    }

    @Test
    public void accountNumbers_ShouldAuto_Increment() {
        Account first = bank.createAccount("Teslim", "1111");
        Account second = bank.createAccount("John", "2222");
        assertEquals(1000, first.getAccountNumber());
        assertEquals(1001, second.getAccountNumber());
    }

    @Test
    public void shouldDeposit_Successfully_ThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        bank.deposit(account.getAccountNumber(), new BigDecimal("5000"));
        assertEquals(new BigDecimal("5000"), bank.checkBalance(account.getAccountNumber(), "1234"));
    }

    @Test
    public void shouldThrowException_WhenDepositingZero_ThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        assertThrows(InvalidAmountException.class, () -> {
            bank.deposit(account.getAccountNumber(), BigDecimal.ZERO);
        });
    }

    @Test
    public void shouldThrowException_WhenDepositing_NegativeAmount_ThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        assertThrows(InvalidAmountException.class, () -> {
            bank.deposit(account.getAccountNumber(), new BigDecimal("-500"));
        });
    }

    @Test
    public void shouldWithdraw_Successfully_ThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        bank.deposit(account.getAccountNumber(), new BigDecimal("5000"));
        bank.withdraw(account.getAccountNumber(), new BigDecimal("2000"), "1234");
        assertEquals(new BigDecimal("3000"), bank.checkBalance(account.getAccountNumber(), "1234"));
    }

    @Test
    public void shouldThrowException_WhenWithdrawingWith_WrongPinThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        bank.deposit(account.getAccountNumber(), new BigDecimal("5000"));
        assertThrows(InvalidPinException.class, () -> {
            bank.withdraw(account.getAccountNumber(), new BigDecimal("2000"), "0000");
        });
    }

    @Test
    public void shouldThrowException_WhenWithdrawingMore_ThanBalanceThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        bank.deposit(account.getAccountNumber(), new BigDecimal("1000"));
        assertThrows(InsufficientFundsException.class, () -> {
            bank.withdraw(account.getAccountNumber(), new BigDecimal("5000"), "1234");
        });
    }

    @Test
    public void shouldCheckBalance_Successfully_ThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        bank.deposit(account.getAccountNumber(), new BigDecimal("3000"));
        assertEquals(new BigDecimal("3000"), bank.checkBalance(account.getAccountNumber(), "1234"));
    }

    @Test
    public void shouldThrowException_WhenCheckingBalance_WithWrongPin_ThroughBank() {
        Account account = bank.createAccount("Teslim", "1234");
        assertThrows(InvalidPinException.class, () -> {
            bank.checkBalance(account.getAccountNumber(), "0000");
        });
    }

    @Test
    public void shouldTransfer_Successfully_BetweenAccounts() {
        Account sender = bank.createAccount("Teslim", "1111");
        Account receiver = bank.createAccount("John", "2222");
        bank.deposit(sender.getAccountNumber(), new BigDecimal("10000"));

        bank.transfer(sender.getAccountNumber(), receiver.getAccountNumber(), new BigDecimal("4000"));

        assertEquals(new BigDecimal("6000"), bank.checkBalance(sender.getAccountNumber(), "1111"));
        assertEquals(new BigDecimal("4000"), bank.checkBalance(receiver.getAccountNumber(), "2222"));
    }

    @Test
    public void shouldThrow_ExceptionWhen_TransferringMore_ThanBalance() {
        Account sender = bank.createAccount("Teslim", "1111");
        Account receiver = bank.createAccount("John", "2222");
        bank.deposit(sender.getAccountNumber(), new BigDecimal("1000"));

        assertThrows(InsufficientFundsException.class, () -> {
            bank.transfer(sender.getAccountNumber(), receiver.getAccountNumber(), new BigDecimal("5000"));
        });
    }

    @Test
    public void receiverBalance_ShouldNotChange_WhenTransferFails() {
        Account sender = bank.createAccount("Teslim", "1111");
        Account receiver = bank.createAccount("John", "2222");
        bank.deposit(sender.getAccountNumber(), new BigDecimal("1000"));

        try {
            bank.transfer(sender.getAccountNumber(), receiver.getAccountNumber(), new BigDecimal("5000"));
        } catch (InsufficientFundsException e) {
        }

        assertEquals(BigDecimal.ZERO, bank.checkBalance(receiver.getAccountNumber(), "2222"));
    }

    @Test
    public void shouldThrowException_WhenDepositing_ToNonExistentAccount() {
        assertThrows(RuntimeException.class, () -> {
            bank.deposit(9999, new BigDecimal("1000"));
        });
    }

    @Test
    public void shouldThrowException_WhenWithdrawing_FromNonExistentAccount() {
        assertThrows(RuntimeException.class, () -> {
            bank.withdraw(9999, new BigDecimal("1000"), "1234");
        });
    }

    @Test
    public void shouldThrowException_WhenCheckingBalance_OfNonExistentAccount() {
        assertThrows(RuntimeException.class, () -> {
            bank.checkBalance(9999, "1234");
        });
    }
}

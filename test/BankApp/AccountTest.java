package BankApp;

import Day7.BankApp.Account;
import Day7.BankApp.exceptions.InsufficientFundsException;
import Day7.BankApp.exceptions.InvalidAmountException;
import Day7.BankApp.exceptions.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("Teslim Odumuyiwa", "1234", 1000);
    }

    @Test
    public void accountShouldHave_ZeroBalance_WhenCreated() {
        assertEquals(BigDecimal.ZERO, account.checkBalance("1234"));
    }

    @Test
    public void accountShould_HaveCorrect_NameWhenCreated() {
        assertEquals("Teslim Odumuyiwa", account.getName());
    }

    @Test
    public void accountShould_HaveCorrectAccount_NumberWhenCreated() {
        assertEquals(1000, account.getAccountNumber());
    }

    @Test
    public void should_Deposit_Successfully() {
        account.deposit(new BigDecimal("5000"));
        assertEquals(new BigDecimal("5000"), account.checkBalance("1234"));
    }

    @Test
    public void shouldThrowException_WhenDeposit_AmountIsZero() {
        assertThrows(InvalidAmountException.class, () -> {
            account.deposit(BigDecimal.ZERO);
        });
    }

    @Test
    public void shouldThrowExceptionWhenDepositAmountIsNegative() {
        assertThrows(InvalidAmountException.class, () -> {
            account.deposit(new BigDecimal("-500"));
        });
    }

    @Test
    public void shouldWithdraw_Successfully() {
        account.deposit(new BigDecimal("5000"));
        account.withdraw(new BigDecimal("2000"), "1234");
        assertEquals(new BigDecimal("3000"), account.checkBalance("1234"));
    }

    @Test
    public void shouldThrowException_WhenWithdrawing_WithWrongPin() {
        account.deposit(new BigDecimal("5000"));
        assertThrows(InvalidPinException.class, () -> {
            account.withdraw(new BigDecimal("2000"), "0000");
        });
    }

    @Test
    public void shouldThrowExceptionWhenWithdrawingMoreThanBalance() {
        account.deposit(new BigDecimal("1000"));
        assertThrows(InsufficientFundsException.class, () -> {
            account.withdraw(new BigDecimal("5000"), "1234");
        });
    }

    @Test
    public void balanceShould_NotChangeWhen_WithdrawWithWrongPin() {
        account.deposit(new BigDecimal("5000"));
        try {
            account.withdraw(new BigDecimal("2000"), "0000");
        } catch (InvalidPinException | InsufficientFundsException e) {
        }
        assertEquals(new BigDecimal("5000"), account.checkBalance("1234"));
    }

    @Test
    public void balanceShouldNotChange_WhenWithdrawing_MoreThanBalance() {
        account.deposit(new BigDecimal("1000"));
        try {
            account.withdraw(new BigDecimal("5000"), "1234");
        } catch (InvalidPinException | InsufficientFundsException e) {
        }
        assertEquals(new BigDecimal("1000"), account.checkBalance("1234"));
    }

    @Test
    public void shouldUpdate_Pin_Successfully() {
        account.updatePin("1234", "9999");
        account.deposit(new BigDecimal("5000"));
        account.withdraw(new BigDecimal("1000"), "9999");
        assertEquals(new BigDecimal("4000"), account.checkBalance("9999"));
    }

    @Test
    public void shouldThrow_ExceptionWhen_UpdatingPin_WithWrongOldPin() {
        assertThrows(InvalidPinException.class, () -> {
            account.updatePin("0000", "9999");
        });
    }

    @Test
    public void shouldCheck_Balance_Successfully() {
        account.deposit(new BigDecimal("3000"));
        assertEquals(new BigDecimal("3000"), account.checkBalance("1234"));
    }

    @Test
    public void should_ThrowException_WhenChecking_BalanceWith_WrongPin() {
        assertThrows(InvalidPinException.class, () -> {
            account.checkBalance("0000");
        });
    }
}

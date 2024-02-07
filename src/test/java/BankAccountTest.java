import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
    public void canReturnBankAccountTest() {
        BankAccount bankAccount = new BankAccount("Saba", "Kia", LocalDate.of(2001, 01, 15), "163527480");

        assertThat(bankAccount.getFirstName()).isEqualTo("Saba");
        assertThat(bankAccount.getLastName()).isEqualTo("Kia");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(LocalDate.of(2001, 01, 15));
        assertThat(bankAccount.getAccountNumber()).isEqualTo("163527480");

        bankAccount.setFirstName("Saba");
        bankAccount.setLastName("Kia");
        bankAccount.setDateOfBirth(LocalDate.of(2001, 01, 15));
        bankAccount.setAccountNumber("163527480");
    }

    @Test
    public void canReturnDeposit() {
        BankAccount bankAccount = new BankAccount("Saba", "Kia", LocalDate.of(2001, 01, 15), "163527480");
        bankAccount.deposit(250);
        assertThat(bankAccount.getBalance()).isEqualTo(250);
    }

    @Test
    public void canReturnWithdrawal() {
        BankAccount bankAccount = new BankAccount("Saba", "Kia", LocalDate.of(2001, 01, 15), "163527480");
        bankAccount.setBalance(100);
        bankAccount.withdrawal(25);
    }

    @Test
    public void canReturnInterest() {
        BankAccount bankAccount = new BankAccount("Saba", "Kia", LocalDate.of(2001, 01, 15), "163527480");
        bankAccount.setBalance(2000);
        bankAccount.allowInterest(10);
        assertThat(bankAccount.getBalance()).isEqualTo(2200);
    }
}


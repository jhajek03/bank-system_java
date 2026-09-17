import java.time.LocalDate;
import java.util.Random;

public class Account {
    private Bank bank;
    private static String nameSurname;
    private static LocalDate bornDate;
    private static String phoneNumber;
    private static String accountNumber;
    private static AccountType type;
    private static int balance;


    public Account(Bank bank, String nameSurname, LocalDate bornDate, String phoneNumber, int balance) {
        this.bank = bank;
        this.nameSurname = nameSurname;
        this.bornDate = bornDate;
        this.phoneNumber = phoneNumber;
        this.type = AccountType.ACTIVE;
        this.balance = balance;

        Random rand = new Random();
        //dodělat atributy banky pro pokračování

    }

    public Bank getBank() {
        return bank;
    }
    public String getNameSurname() {
        return nameSurname;
    }
}

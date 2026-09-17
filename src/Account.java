import java.time.LocalDate;
import java.util.Random;
import java.util.ArrayList;

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
        int accNum;
        boolean exists = false;
        do {
            accNum = rand.nextInt(99999 - 10000 + 1) + 10000;

            for (Account acc : bank.getAccounts()) {
                if (Integer.parseInt(acc.getAccountNumber()) == accNum) {
                    exists = true;
                    break;
                }
            }

        } while (exists);
        this.accountNumber = String.valueOf(accNum);

    }

    public Bank getBank() {
        return bank;
    }
    public String getNameSurname() {
        return nameSurname;
    }
    public LocalDate getBornDate() {
        return bornDate;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public AccountType getType() {
        return type;
    }
    public int getBalance() {
        return balance;
    }
    protected void setBalance(int balance) {
        this.balance = balance;
    }

    //vytváření instancí TransferRec
    //insertion
    //withdrawal
}

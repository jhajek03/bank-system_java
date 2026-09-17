import java.time.LocalDate;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private RecordHistory history;

    protected ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account createAccount(Bank bank, String nameSurname, LocalDate bornDate, String phoneNumber, int balance) {
        Account newAcc = new Account(bank, nameSurname, bornDate, phoneNumber, balance);
        accounts.add(newAcc);
        return newAcc;
    }

    public void getHistory(Bank bank) {
        history.listRecords();
    }

    public void getUserHistory(Bank bank, Account account) {
        history.listUserRecords(account);
    }

    //vytváření instancí TransferRec
    //insertion
    //withdrawal
}

import java.time.LocalDateTime;

public class Transaction {
    private Account from;
    private Account to;
    private int amount;

    public Transaction(Account from, Account to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void ConfirmTransfer(Account from, Account to, int amount) {
        if (from.getType().equals(AccountType.ACTIVE) && !to.getType().equals(AccountType.DELETED)) {
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            LocalDateTime time = LocalDateTime.now();
            TransferRec record = new TransferRec(from, to, amount, time, TransferRecType.TRANSFER);
            Bank bank = from.getBank();
            bank.writeRecord(record);
        }
        else {
            throw new IllegalStateException("Invalid transfer type");
        }

        System.out.println("Transfer successful");
    }
}

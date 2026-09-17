import java.time.LocalDateTime;

public record TransferRec(Account from, Account to, int balance, LocalDateTime date, TransferRecType type) {
    @Override
    public String toString() {
        switch (type) {
            case TRANSFER:
                return balance + "Kč sent from" + from.getNameSurname() + " to " + to.getNameSurname() + "at: " + date;

            case INSERTION:
                return balance + "inserted to the bank account at: " + date;

            case WITHDRAWAL:
                return balance + "withdrawn from bank account at: " + date;

            default:
                throw new IllegalStateException("Unknown transfer type: " + type);
        }
    }
}

import java.util.ArrayList;

public class RecordHistory {
    private static ArrayList<TransferRec> history = new ArrayList<TransferRec>();

    public void writeRecord(TransferRec record) {
        history.add(record);
    }

    public void listRecords() {
        for (TransferRec record : history) {
            System.out.println(record.toString());
        }
    }

    public void listUserRecords(Account account) {
        ArrayList<TransferRec> userRecords = history;
        for (TransferRec record : history) {
            if (!record.from().equals(account.getNameSurname()) && !record.to().equals(account.getNameSurname())) {
                userRecords.remove(record);
            }
        }
        for (TransferRec record : userRecords) {
            System.out.println(record.toString());
        }
    }
}

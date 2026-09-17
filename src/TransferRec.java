import java.time.LocalDate;
import java.time.LocalDateTime;

public record TransferRec(String from, String to, int balance, LocalDateTime date, String type) {
}

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime moment;
    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }
    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(1_000_000_000L);
    }

    public LocalDateTime getDateTime() {
        return moment;
    }
}

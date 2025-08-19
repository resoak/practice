import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("M/dd/yyyy kk:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(appointmentDateDescription, dtm);
        return ldt;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime ldt = LocalDateTime.now();
        return ldt.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int year = appointmentDate.getYear();
        int month = appointmentDate.getMonthValue();
        int day = appointmentDate.getDayOfMonth();
        LocalDateTime before_12 = LocalDateTime.of(year,month,day,11,59,59);
        LocalDateTime six = LocalDateTime.of(year,month,day,18,0,0);
        return appointmentDate.isAfter(before_12) && appointmentDate.isBefore(six);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String str="You have an appointment on ";
        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("EEEE, LLLL d, yyyy, ",Locale.US);
        String date = appointmentDate.format(dtm);
        str=str+date+"at ";
        dtm = DateTimeFormatter.ofPattern("h:mm a.",Locale.US);
        date = appointmentDate.format(dtm);
        str+=date;
        return str;
        
    }
    public LocalDate getAnniversaryDate() {
        int year_now = LocalDate.now().getYear();
        return LocalDate.of(year_now,9,15);
    }
}

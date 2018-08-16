import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDate_local {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.set(Calendar.MONTH, 2);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat.format(date));
//        Date date1 = simpleDateFormat.parse("21/02/2018");

        LocalDate localDate = java.time.LocalDate.now();
        localDate.minusDays(5);
        localDate.plusMonths(6);
//        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println(localDate.format(dateTimeFormatter));
//        LocalDate localDate1 = java.time.LocalDate.parse("dd/MM/yyyy", dateTimeFormatter);
    }
}

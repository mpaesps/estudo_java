import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class atividade_51_converterDteTimeGlobalParaLocal {
    public static void main(String[] args) {

        LocalDate d04       = LocalDate.parse("2023-02-14");
        LocalDateTime d05   = LocalDateTime.parse("2023-02-14T15:23:10");
        Instant d06         = Instant.parse("2023-02-14T15:36:00Z");

//        for (String s: ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

         LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
         LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
         LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
         LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r1 = " + r2);
        System.out.println("r1 = " + r3);
        System.out.println("r1 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d04 ano = " + d04.getYear());

    }
}

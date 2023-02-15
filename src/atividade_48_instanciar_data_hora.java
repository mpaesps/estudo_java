import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class atividade_48_instanciar_data_hora {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm" );


        LocalDate d01       = LocalDate.now();
        LocalDateTime d02   = LocalDateTime.now();
        Instant d03         = Instant.now();

        LocalDate d04       = LocalDate.parse("2023-02-14");
        LocalDateTime d05   = LocalDateTime.parse("2023-02-14T15:23:10");
        Instant d06         = Instant.parse("2023-02-14T15:36:00Z");
        Instant d07         = Instant.parse("2023-02-14T15:36:00-03:00");

        LocalDate d08       = LocalDate.parse("14/02/2023", fmt1);
        LocalDateTime d09   = LocalDateTime.parse("14/02/2023 01:30", fmt2);
        LocalDate d11       = LocalDate.parse("14/02/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d10   = LocalDateTime.parse("14/02/2023 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d12 = LocalDate.of(2023,2,14);
        LocalDateTime d13 = LocalDateTime.of(2023,2,14, 21, 23);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
        System.out.println("d12: " + d12);


    }
}

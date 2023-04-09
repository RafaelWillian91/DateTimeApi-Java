package verificandoDataentreDatas;

import java.time.*;

public class Verificador {

    public static void main(String[] args) {

        //atStartOfDay combina uma data com um tempo Determinado
        var start = LocalDate.of(2022,02,2).atStartOfDay().atOffset(ZoneOffset.UTC);

        OffsetDateTime end = LocalDate.of(2030,04,15).atTime(LocalTime.MAX).atOffset(ZoneOffset.UTC);

        System.out.println(start);
        System.out.println(end);

        OffsetDateTime localDateTime = LocalDate.of(1991,04, 25).atTime(LocalTime.now().atOffset(ZoneOffset.UTC));

        OffsetDateTime offDateTimeNow = OffsetDateTime.now();

        System.out.println(inRange(offDateTimeNow, start, end));

        System.out.println(inRange(localDateTime, start, end));

//        OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneOffset.of("00:00"));
//        System.out.println(offsetDateTime);

    }

    private static boolean inRange(OffsetDateTime odt, OffsetDateTime start, OffsetDateTime end){
        return odt.isEqual(start) || odt.isEqual(end) || odt.isAfter(start) && odt.isBefore(end);
    }
}

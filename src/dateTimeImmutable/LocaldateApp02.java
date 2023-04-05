package dateTimeImmutable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocaldateApp02 {

    public static void main(String[] args) {

        //Cria uma instancia imutável de LocalDate
        LocalDate localDate = LocalDate.of(2000, 02, 20);
        //LocalDate é imutável

        //Operações em LocalDate
        //Os métodos withAlgumaCoisa altera só a informacao passada gerando uma novo objeto com as informacoes anteriores
        LocalDate localDate2 =  localDate.withYear(2005).withMonth(4);

        System.out.println(localDate);
        System.out.println(localDate2);

        //Somar datas
        LocalDate localDate3 = localDate.plusDays(4);
        System.out.println(localDate3);

        //Minus diminui
        LocalDate localDate4 = localDate.minusMonths(10);
        System.out.println(localDate4);

        //Uma segunda opcao é usar o ChronoUnits, junto com minus. Não existe melhor ou pior
        LocalDate localDate5 = localDate.minus(5, ChronoUnit.DAYS);
        System.out.println(localDate5);

        //Na Aula anterior pegamos um padrão de String com DateTimeFormat para um objeto do Tipo LocalDate7
        //Para fazer o processo inverso agora. objetos do tipos localDate tem um método format
        String formatData = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(formatData);




    }
}

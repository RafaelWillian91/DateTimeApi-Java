package localDate01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocaldateApp01 {

    public static void main(String[] args) {

        //Umas das classes mais utilizadas é a LocalDate, a instancia dessa classe é obtida atraves da chamada
        //a um método especifico dentro da propria classe, Devido ao seu construtor ser privado
        LocalDate localDate = LocalDate.of(2050, 01, 01);

        System.out.println(localDate);

        //Quando tenho uma fonte externa eu posso passar o método static .parse para obter a Data
        LocalDate localDate2 = LocalDate.parse("2043-09-23");
        System.out.println(localDate2);

        //E se a Data estiver no formato dia/mes/ano
        //O formato original do java é ano-mes-dia
        //Para expecificar o formato que vai vir eu passo através do DateTimeFormatter, assim eu mostro pro java
        //como sera o formato para ele criar a instancia de forma correta.
        LocalDate localDate3 = LocalDate.parse("25/03/1991", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //Assim ele consegue obter a instancia de modo correto.
        System.out.println(localDate3);

    }
}

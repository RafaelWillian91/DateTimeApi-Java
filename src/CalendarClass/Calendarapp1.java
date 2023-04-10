package CalendarClass;

import java.util.Calendar;

public class Calendarapp1 {

    public static void main(String[] args) {

        //No pacote legado da classes de Time do java a classe Date não consegue fazer muita coisa sozinha
        //Precisamos da classe Calendar para Ano, meses, dias e horas.
        Calendar c1 = Calendar.getInstance();
        //Existe um construtor que recebe uma Timezone, mas não funciona muito bem.

        //Calendar sempre retorna a data e hora atual.
        //Para trocar a data precisamos chamar outro método

        c1.set(2021, 03, 10, 14, 30,20);//Chama um setTime e passa um date. Que api de louco
        //Calendar e Date são objetos mutáveis

        System.out.println(c1.getTime());

        //Janeiro para o Calendar é o mês 0.

        //Para ficar mais intuitivo podemos Colocar uma constante no Mês
        c1.set(2021, Calendar.MARCH, 10, 14, 30,20);

        System.out.println(c1.getTime());

        //Para adicionar campos no Calendar usamos o método .add
        c1.add(Calendar.YEAR, 3);
        System.out.println(c1.getTime());

        //Para subtrair passamos um valor negatico
        c1.add(Calendar.MONTH, -1);
        System.out.println(c1.getTime());

        //Voce passa um valor negativo no minus e ele retorna os meses, anos..os fields.
        c1.add(1, -1);
        System.out.println(c1.getTime());

    }
}

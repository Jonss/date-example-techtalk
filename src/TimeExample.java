import sun.util.resources.cldr.xog.LocaleNames_xog;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class TimeExample {
    public static void main(String[] args) {
        //Data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual: " + hoje);

        //Inserir valor na data
        LocalDate novaData = LocalDate.of(2015, 8, 2);
        System.out.println("A nova data é: " + novaData);

        //Comparar datas
        LocalDate agora = LocalDate.now();
        LocalDate depois = LocalDate.of(2016, 9, 8);

        boolean equals = agora.equals(depois);
        System.out.println(equals);

        boolean before = agora.isBefore(depois);
        System.out.println(before);

        boolean after = agora.isAfter(depois);
        System.out.println(after);

        if(equals == true){
            System.out.println("As datas são iguais");
        } else if (before == true){
            System.out.println("A data atual é menor que a data informada");
        } else {
            System.out.println("A data atual é maior que a data  informada");
        }

        //Adiciona dia, mes e ano

        LocalDate mesQueVem = depois.plusMonths(1);
        System.out.println("Adicionando meses: " + mesQueVem);

        LocalDate proximoDia = depois.plusDays(1);
        System.out.println("Adicionando dias: " + proximoDia);

        LocalDate proximoAno = depois.plusYears(1);
        System.out.println("Adicionando anos: " + proximoAno);

        // Data de agora
        // Setta valor na data
        //Compara datas
        // adiciona dias, meses, anos
        //print nas datas

    }

}

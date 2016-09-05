import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//        Retorna a data atual c/ Calendar

        Calendar now = Calendar.getInstance();
        System.out.println("Data atual: " + sdf.format(now.getTime()));

//        Compara duas datas e retorna se são iguais c/ Calendar

        Calendar firstDate = Calendar.getInstance();
        Calendar secondDate = Calendar.getInstance();

        System.out.println("Data a ser comparada: " + sdf.format(firstDate.getTime()));
        System.out.println("Retorno compareTo first e secondDate: " + firstDate.compareTo(secondDate));

//        Setando um valor para a data c/ Calendar

        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_MONTH, 30);
        date.set(Calendar.MONTH, 3);
        date.set(Calendar.YEAR, 2015);
        System.out.println("Setando um valor para a data: " + sdf.format(date.getTime()));

//        Adicionando dias, meses e anos c/ Calendar

        Calendar dateAddDays = Calendar.getInstance();
        dateAddDays.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Adicionando dias: " + sdf.format(dateAddDays.getTime()));

        Calendar dateAddMonths = Calendar.getInstance();
        dateAddMonths.add(Calendar.MONTH, 1);
        System.out.println("Adicionando meses: " + sdf.format(dateAddMonths.getTime()));

        Calendar dateAddYears = Calendar.getInstance();
        dateAddYears.add(Calendar.YEAR, 5);
        System.out.println("Adicionando anos: " + sdf.format(dateAddYears.getTime()));

        // Data de agora
        // Setta valor na data
        //Compara datas
        // adiciona dias, meses, anos
        //print nas datas

    }
}

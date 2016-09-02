import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Calendar now = Calendar.getInstance();
        System.out.println(sdf.format(now.getTime()));

        now.add(Calendar.MONTH, -1);
        System.out.println(sdf.format(now.getTime()));

        // Data de agora
        // Setta valor na data
        //Compara datas
        // adiciona dias, meses, anos
        //print nas datas

    }
}

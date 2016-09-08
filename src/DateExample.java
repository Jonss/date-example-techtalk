import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {

        //Pega data de hoje
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");
        System.out.println("Agora: " + sdf.format(hoje));


        //Compara datas
        Date depois = new Date();
        depois.setTime(hoje.getTime());
        depois.setDate(8);
        int compareTo = hoje.compareTo(depois);
        System.out.println("Amanhã: " + sdf.format(depois));

        if (compareTo < 0){
            System.out.println("Hoje é menor que: " + sdf.format( depois));
        } else if (compareTo > 0){
            System.out.println("Hoje é maior que: " + sdf.format(depois));
        } else {
            System.out.println("Hoje é: " + sdf.format(depois));
        }

        //Adiciona dias à data atual
        hoje.setDate(hoje.getDate() + 10);
        System.out.println("Adicionando dias: " + sdf.format(hoje));

        hoje.setMonth(hoje.getMonth() + 2);
        System.out.println("Adicionando meses: " + sdf.format(hoje));

        hoje.setYear(hoje.getYear() + 2);
        System.out.println("Adicionando anos: " + sdf.format(hoje));

        // Data de agora
        // Setta valor na data
        //Compara datas
        // adiciona dias, meses, anos
        //print nas datas

    }
}

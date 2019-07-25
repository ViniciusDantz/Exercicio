
import java.util.Calendar;

public class Idade {
    
    public static int idadeDias(int dia, int mes, int ano){
        Calendar c = Calendar.getInstance();
        int dias = c.get(Calendar.DAY_OF_MONTH) - dia;
        dias += (c.get(Calendar.YEAR) - ano) * 365;
        dias += (c.get(Calendar.MONTH) - mes +1) * 30;
        return dias;
    }
}
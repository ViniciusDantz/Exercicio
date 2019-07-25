
public class NumeroDecrescente {
	
    public static String decrescente(int nmr) {
        String sequencia = "";
        for (int i = nmr; i >= 0; i--) {
            sequencia += i + " ";
        }
        return sequencia;
    }
}

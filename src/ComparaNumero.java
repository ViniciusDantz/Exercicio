
public class ComparaNumero {

    public static String comparacao(int nmr1, int nmr2) {
        if(nmr1 == nmr2) {
            return "iguais";
        }else if(nmr1 > nmr2) {
            return "diferentes\n"+nmr1+ " " +nmr2;
        }else {
            return "diferentes\n"+nmr2+ " " +nmr1;			
        }
    }
}

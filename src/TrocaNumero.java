
public class TrocaNumero {
    public static int[] troca(int numA, int numB){
        int[] sequencia = new int[2];
        int aux = numB;
        numB = numA;
        numA = aux;
        sequencia[0] = numA;
        sequencia[1] = numB;
        return sequencia;
    }
	
}

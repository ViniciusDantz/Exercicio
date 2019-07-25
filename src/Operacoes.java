
public class Operacoes {

    public static int somaImpares() {
        int soma = 0;
        for (int i = 0; i <= 30; i++) {
            if((i%2) != 0) {
                soma += i;
            }
        }
        return soma;
    }

    public static double multPares() {
        double mult = 1;
        for (int i = 0; i <= 30; i++) {
            if((i%2) == 0 && i != 0) {
                mult *= i;
            }
        }
        return mult;
    }
}

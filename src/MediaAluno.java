
public class MediaAluno {

    int[] nomes;

    public MediaAluno() {
        nomes = new int[3];
    }
    public void insereNotas(int[] notas) {
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >= 0 && notas[i] <= 100) {
                nomes[j] = notas[i];
                j++;
            }else {
                System.out.println("ERRO: Notas maiores que 100 ou menores que 0");
                break;
            }
        }
    }

    public double media() {
        double media = 0;
        for (int i = 0; i < nomes.length; i++) {
            media += nomes[i];
        }
        media = media / nomes.length;
        return media;
    }
}

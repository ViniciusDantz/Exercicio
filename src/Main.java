import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //----------1.-----------
        /*int nmr1, nmr2;
        System.out.printf("Número 1: ");
        nmr1 = ler.nextInt();
        System.out.printf("Número 2: ");
        nmr2 = ler.nextInt();
        System.out.println("Maior número = "+MaiorNumero.maiorNumero(nmr1, nmr2));*/

        //---------2.-----------
        /*int nmr;
        System.out.printf("Insira um número: ");
        nmr = ler.nextInt();
        System.out.printf(NumeroDecrescente.decrescente(nmr));*/

        //--------3-----------
        /*System.out.println("Soma ímpares: "+Operacoes.somaImpares()+
        "\nMultiplicação Pares: "+ Operacoes.multPares());*/

        //---------4----------
        /*System.out.printf("Atribua valores\nNumA: ");
        int num1 = ler.nextInt();
        System.out.printf("NumB: ");
        int num2 = ler.nextInt();
        System.out.println("\nResultado:\nNumA = " +TrocaNumero.troca(num1, num2)[0]+
        "\nNumB = " +TrocaNumero.troca(num1, num2)[1]);*/

        //---------5----------
        /*System.out.printf("Digite um número: ");
        int nmr1 = ler.nextInt();
        System.out.printf("Digite outro número: ");
        int nmr2 = ler.nextInt();
        System.out.println("Eles são " + ComparaNumero.comparacao(nmr1, nmr2));*/

        //--------6---------
        /*int[] notas = new int[3];
        MediaAluno mA = new MediaAluno();
        System.out.println("Insira as notas:");
        System.out.printf("(1): ");
        notas[0] = ler.nextInt();
        System.out.printf("(2): ");
        notas[1] = ler.nextInt();
        System.out.printf("(3): ");
        notas[2] = ler.nextInt();
        mA.nomes = notas;
        System.out.println("Média: "+ mA.media());*/

        //-----------7--------------
        /*Agenda agenda = new Agenda();
        Contato contato = new Contato();

        contato.setNome("Solutis");
        contato.setEmail("@solutis.com.br");
        agenda.addContato(contato);

        contato = new Contato();
        contato.setNome("Gmail");
        contato.setEmail("@gmail.com");
        agenda.addContato(contato);

        contato = new Contato();
        contato.setNome("Hotmail");
        contato.setEmail("@hotmail.com");
        agenda.addContato(contato);

        System.out.println("Nome buscado: " +agenda.buscaNome("gmail").getNome());

        try{
            System.out.println("\n"+agenda.buscaNome("hotmail").getNome()+ "\n"+agenda.buscaNome("gmail").getNome()+
           "\n"+ agenda.buscaNome("solutis").getNome());

            agenda.excluiContato("hotmail");

            System.out.println(agenda.buscaNome("solutis").getNome());
            System.out.println(agenda.buscaNome("gmail").getNome());
            System.out.println(agenda.buscaNome("hotmail").getNome());
        }catch(NullPointerException e){
            System.out.println("Contato não encontrado");
        }*/
        //--------------Lista2------------------
        //----------------1-----------------
        /*System.out.println("Digite sua data de nascimento (DD/MM/AA): ");
        String data = ler.next();
        String day = "", month = "", year = "";
        int barra = 0;
        for (int i = 0; i < data.length(); i++) {
            if(barra == 0){
                if(data.charAt(i) != '/'){
                    day += data.charAt(i);
                }else{
                    barra++;
                }
            }else if(barra == 1){
                if(data.charAt(i) != '/'){
                    month += data.charAt(i);
                }else{
                    barra++;
                }
            }else if(barra == 2){
                if(data.charAt(i) != '/'){
                    year += data.charAt(i);
                }else{
                    barra++;
                }
            }
        }
        System.out.println(Idade.idadeDias(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year))
        +" dias de vida");*/
        //--------------2----------------
        /*double media1 = 7 + 9 + 8, media2 = 4+5+6;
        System.out.println("Média(9,8,7): " +(media1)/3+"\nMédia(4,5,6): "+(media2)/3+
        "\nSoma: " +((media1)/3+(media2)/3)+ "\nMédia das médias: " +((media1)/3+(media2)/3)/2);*/
        
        //--------------3----------------
        /*System.out.printf("Informe saldo: ");
        double saldo = ler.nextInt();
        System.out.println("Saldo com reajuste: " +(saldo+(saldo/100)));*/
        
        //---------------4--------------
        /*System.out.printf("Porcentagem IPI: ");
        double ipi = ler.nextDouble();
        System.out.printf("Valor 1: ");
        double valor1 = ler.nextDouble();
        System.out.printf("Quantidade 1: ");
        double quant1 = ler.nextDouble();
        
        System.out.printf("Valor 2: ");
        double valor2 = ler.nextDouble();
        System.out.printf("Quantidade 2: ");
        double quant2 = ler.nextDouble();
        
        System.out.println("Resultado: " + (valor1*quant1 + valor2*quant2)*(ipi/100 + 1));*/
        
        //----------5------------
        /*System.out.printf("Valor salário mínimo: ");
        double sm = ler.nextDouble();
        System.out.printf("Valor salário usuário: ");
        double salarioU = ler.nextDouble();
        System.out.println((salarioU/sm) +" salários mínimos");*/
        
        //---------------6----------------
        System.out.printf("Digite um número: ");
        int num = ler.nextInt();
        System.out.println("Antecessor: " +(num-1)+ "\nSucessor: "+(num+1));
    }
}

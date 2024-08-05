package PrimeiroProjeto;

import java.util.Scanner;

public class PrimeiroProjeto {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        Scanner leitor = new Scanner(System.in);

        //entrada de dados
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();

        //saída de dados
        System.out.println("Idade: "); //pula uma linha
        System.out.print("Dólar: "); //não pula linha

    }
}

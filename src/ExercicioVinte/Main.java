package ExercicioVinte;

import java.util.Scanner;
/*
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */
public class Main {
    public static void main(String[] args) {
        int anoFabricação = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.print("Digite o ano de fabricação do veículo: ");
            anoFabricação = leitor.nextInt();
            System.out.print("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();

            if (anoFabricação <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é: " + valorPagar);

            System.out.print("Deseja fazer mais cadastros? S - Sim / N - Não: ");
            desejaRepetir = leitor.next().charAt(0);
        }

        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}

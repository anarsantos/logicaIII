package Classes;

import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //no lugar de peso e altura, criar a variável pessoa (não primitiva).
        Pessoa objetoPessoa = new Pessoa();

        System.out.print("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.print("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}

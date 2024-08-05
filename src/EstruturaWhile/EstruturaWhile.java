package EstruturaWhile;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        int totalAlunos = 5;
        while (totalAlunos > 0) {
            System.out.print("Digite seu nome: ");
            String nomeAluno = leitorScanner.nextLine();
            System.out.print("Digite sua idade: ");
            int idadeAluno = leitorScanner.nextInt();
            leitorScanner.nextLine();

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }
}

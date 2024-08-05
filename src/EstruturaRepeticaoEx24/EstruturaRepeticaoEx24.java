package EstruturaRepeticaoEx24;

import java.util.Scanner;

public class EstruturaRepeticaoEx24 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um número:");
            int numero = leitorScanner.nextInt();
            if (numero == 0) {
                System.out.println("O número é zero.");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que zero.");
                } else {
                    System.out.println("O número é menor que zero.");
                }
            }
            System.out.println("Deseja continuar? S-Sim/N-Não");
            desejaContinuar = leitorScanner.next().charAt(0); //chartAt pega um caracter
        }
    }
}

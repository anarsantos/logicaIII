package Heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("123456789");
        v.setDataNascimento(new Date());
        v.setComiisaoPorItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é: " + v.calcularSalario());

        Motorista m = new Motorista();
    }
}

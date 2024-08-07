package Heranca;

public class Vendedor extends Funcionario {
    private int totalItensVendidos;
    private float comiisaoPorItem;

    public Vendedor() {
        super();
    }

    public float calcularSalario() {
        return super.getSalario() + (this.comiisaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComiisaoPorItem() {
        return comiisaoPorItem;
    }

    public void setComiisaoPorItem(float comiisaoPorItem) {
        this.comiisaoPorItem = comiisaoPorItem;
    }
}

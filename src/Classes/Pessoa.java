package Classes;

public class Pessoa {
    //atributos
    private float peso;
    private float altura;

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    //métodos acessores dão acesso as entidades externas a classe pessoa para acessarem as informações.
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}

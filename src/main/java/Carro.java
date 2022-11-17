public class Carro {

    private String modelo;
    private Cor cor;

    public Carro(String modelo, Cor cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor.getCor() + "'}";
    }
}
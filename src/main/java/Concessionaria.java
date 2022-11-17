import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Carro> carros = new ArrayList<>();

    public void cadastrarCarro(String modelo, String corStr){
        Cor cor = CorFactory.getCor(corStr);
        Carro carro = new Carro(modelo, cor);
        carros.add(carro);
    }

    public List<String> obterCarros(){
        List<String> listaCarros = new ArrayList<>();
        for (Carro carro:this.carros) {
            listaCarros.add(carro.toString());
        }
        return listaCarros;
    }
}

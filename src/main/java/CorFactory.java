import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static Map<String, Cor> cores = new HashMap<>();

    public static Cor getCor(String cor){
        Cor corAux = cores.get(cor);
        if(corAux == null){
            corAux = new Cor(cor);
            cores.put(cor, corAux);
        }
        return corAux;
    }

    public static int getTotalCores(){
        return cores.size();
    }
}

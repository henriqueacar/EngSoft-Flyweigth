import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConcessionariaTest {

    @Test
    void deveRetornarCarros(){
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.cadastrarCarro("Onix", "Prata");
        concessionaria.cadastrarCarro("Cruze", "Vermelho");
        concessionaria.cadastrarCarro("Tracker", "Vermelho");
        concessionaria.cadastrarCarro("Camaro", "Amarelo");
        concessionaria.cadastrarCarro("Celta", "Prata");

        List<String> listaCarros = Arrays.asList(
                "Carro{modelo='Onix', cor='Prata'}",
                "Carro{modelo='Cruze', cor='Vermelho'}",
                "Carro{modelo='Tracker', cor='Vermelho'}",
                "Carro{modelo='Camaro', cor='Amarelo'}",
                "Carro{modelo='Celta', cor='Prata'}"
        );

        assertEquals(listaCarros, concessionaria.obterCarros());
    }

    @Test
    void deveRetornarTotalCores(){
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.cadastrarCarro("Onix", "Prata");
        concessionaria.cadastrarCarro("Cruze", "Vermelho");
        concessionaria.cadastrarCarro("Tracker", "Vermelho");
        concessionaria.cadastrarCarro("Camaro", "Amarelo");
        concessionaria.cadastrarCarro("Celta", "Prata");

        assertEquals(3, CorFactory.getTotalCores());
    }

}
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratar("Camila", "Juiz de Fora", "MG");
        empresa.contratar("Alice", "Juiz de Fora", "MG");
        empresa.contratar("Marina", "Cabo Frio", "RJ");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Camila', cidade='Juiz de Fora', uf='MG'}",
                "Funcionario{nome='Alice', cidade='Juiz de Fora', uf='MG'}",
                "Funcionario{nome='Marina', cidade='Cabo Frio', uf='RJ'}");

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCidades() {
        Empresa empresa = new Empresa();
        empresa.contratar("Camila", "Juiz de Fora", "MG");
        empresa.contratar("Alice", "Juiz de Fora", "MG");
        empresa.contratar("Marina", "Cabo Frio", "RJ");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}
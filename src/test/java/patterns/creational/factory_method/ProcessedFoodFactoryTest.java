package patterns.creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessedFoodFactoryTest {
    @Test
    void deveRetornarExcecaoParaAlimentoProcessadoInexistente() {
        try{
            IProcessedFood processedFood = ProcessedFoodFactory.processFood("FrozenPizza");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Alimento processado inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlimentoProcessadoInvalido() {
        try {
            IProcessedFood processedFood = ProcessedFoodFactory.processFood("Biscuit");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Alimento processado inválido.", e.getMessage());
        }
    }
}
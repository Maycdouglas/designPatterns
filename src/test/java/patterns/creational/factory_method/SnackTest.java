package patterns.creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest {
    @Test
    void deveRetornarSalgadinhoSendoEmpacotado() {
        IProcessedFood food = ProcessedFoodFactory.processFood("Snack");
        assertEquals("Salgadinho sendo empacotado...", food.packageFood());
    }
}
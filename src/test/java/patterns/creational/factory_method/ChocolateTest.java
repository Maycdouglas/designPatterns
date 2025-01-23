package patterns.creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateTest {
    @Test
    void deveRetornarChocolateSendoEmpacotado(){
        IProcessedFood food = ProcessedFoodFactory.processFood("Chocolate");
        assertEquals("Chocolate sendo empacotado...", food.packageFood());
    }
}
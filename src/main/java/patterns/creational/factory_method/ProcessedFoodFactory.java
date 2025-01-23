package patterns.creational.factory_method;

public class ProcessedFoodFactory {
    public static IProcessedFood processFood(String processedFood){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("patterns.creational.factory_method." + processedFood);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Alimento processado inexistente.");
        }
        if (!(objeto instanceof IProcessedFood)){
            throw new IllegalArgumentException("Alimento processado inválido.");
        }
        return (IProcessedFood) objeto;
    }
}

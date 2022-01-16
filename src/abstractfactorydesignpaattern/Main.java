package abstractfactorydesignpaattern;

public class Main {
    public static void main(String[] a){
        AbstractFactory platform=FactoryProducer.getFactory(true);
        Platform ottPlatform=platform.getInstance("Costly");
        ottPlatform.Subscription();
        AbstractFactory platform1=FactoryProducer.getFactory(false);
        Platform dishtvplatform=platform1.getInstance("Costly");
        dishtvplatform.Subscription();
    }
}

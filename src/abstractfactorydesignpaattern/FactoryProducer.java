package abstractfactorydesignpaattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean Ott){
        if(Ott){
            return new OttPlatformFactory();
        }else{
            return new DishTvPlatformFactory();
        }
    }
}

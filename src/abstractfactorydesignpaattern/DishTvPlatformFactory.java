package abstractfactorydesignpaattern;

public class DishTvPlatformFactory extends AbstractFactory{
    public Platform getInstance(String str){
        if(str.equals("Costly"))
            return new Airtel();
        else if(str.equals("Moderate"))
            return new TataSky();
        else
            return new Hathway();
    }
}


package abstractfactorydesignpaattern;

public class OttPlatformFactory extends  AbstractFactory {
    public Platform getInstance(String str){
        if(str.equals("Costly"))
            return new Netflix();
        else if(str.equals("Moderate"))
            return new PrimeVideo();
        else
            return new Hotstar();
    }
}

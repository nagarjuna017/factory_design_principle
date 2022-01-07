package factorydesignpaattern;

public class OttFactory {
    public OttPlatform getInstance(String str){
        if(str.equals("Costly"))
            return new Netflix();
        else if(str.equals("Moderate"))
            return new PrimeVideo();
        else
            return new Hotstar();
    }
}

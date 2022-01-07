package factorydesignpaattern;

public class Main {
    public static void main(String[] a){
        OttFactory ottFactory=new OttFactory();
        OttPlatform ottPlatform=ottFactory.getInstance("Costly");
        ottPlatform.SubscriptionPrice();
    }
}

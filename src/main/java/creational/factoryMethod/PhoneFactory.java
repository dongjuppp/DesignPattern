package creational.factoryMethod;

public class PhoneFactory implements Factory{

    public Product create(String name) {
        try{
            Class<?> cls=Class.forName(name);
            Object obj=cls.newInstance();
            return (Product)obj;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

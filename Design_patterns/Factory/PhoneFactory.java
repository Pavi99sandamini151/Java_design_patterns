package factory;

public class PhoneFactory {

    public Phone getPhone(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("low price")){
            return new Huaweiphone();
        }
        else if(shapeType.equalsIgnoreCase("middle range price")){
            return new SamsungPhone();
        }
        else if(shapeType.equalsIgnoreCase("expensive")){
            return new Iphone();
        }

        return null;
    }
}
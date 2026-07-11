package Inheritance;
import javax.xml.namespace.QName;

public class Bike extends Vechicle {
    public String HandleBarStyle;
    public String suspensionType;
    Bike(String name,String model,int noOfTyre,String HandleBarstyle,String suspensionType){
        super(name,model,noOfTyre);
        this.HandleBarStyle=HandleBarstyle;
        this.suspensionType=suspensionType;
    }
    public void wheelieee(){
        System.out.println("Tye od Wheeliee: "+name);
    }


}

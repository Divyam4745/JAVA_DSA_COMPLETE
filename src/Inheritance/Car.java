package Inheritance;

public class Car extends Vechicle {
    public int noOfDoors;
    public String transimissionTyre;
    //Here is a car constructor
    Car (String name,String model,int noOfTyre,int noOfDoors,String transimissionTyre){
        super(name, model, noOfTyre);
        this.transimissionTyre=transimissionTyre;
        this.noOfDoors=noOfDoors;
    }
    public void startAC(){
        System.out.println("The AC is Starting:"+name);
    }
}

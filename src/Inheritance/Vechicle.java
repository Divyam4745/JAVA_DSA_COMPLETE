package Inheritance;
public class Vechicle {
    public String name;
    public String model;
    public int noOfTyre;

    //Constructor of Vechicle
        Vechicle(){
        this.name="";
        this.model="";
        this.noOfTyre=-1;
        }
        Vechicle(String name, String model, int noOfTyre) {
            this.name = name;
            this.model = model;
            this.noOfTyre = noOfTyre;
        }

    public void startEngine() {
        System.out.println("Engine is starting of: "+name+model);
    }

    public void Stopengine() {
        System.out.println("Engine is stoping of: "+name+model);
    }
}
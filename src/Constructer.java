public class Constructer {

    String name;
    int age;
    int mob;

    //DEFAULT CONSTRUCTER
    Constructer(){
        System.out.println("Constructer is called");
    }

    //PARAMETERIZED CONSTRUCTER
    Constructer(String a,int b,int c){
        name=a;
        age=b;
        mob=c;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
    }

    //  Constructor Using this Keyword
//    Constructer(String a,int b,int c){
//        this.name=a;
//        this.age=b;
//        this.mob=c;
//    }
//    void display(){
//        System.out.println("Name: "+ name);
//        System.out.println("Age: " + age);
//        System.out.println("Mobile: " + mob);
//    }
    static void main(String[] args) {
        //DEFAULT CONSTRUCTER
        Constructer c1=new Constructer();
        //PARAMETERIZED CONSTRUCTER
        Constructer c2=new Constructer("Divyam",21,730797686);
        c2.display();
        //THIS USING
//        Constructer c2=new Constructer("Divyam",21,730797686);
//        c2.display();
    }
}

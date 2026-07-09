public class Encapsulation {
    private String name;
    private int age;

    public void setName(String n1){
        this.name=n1;
    }
    public  void setAge(int n2){
        if (age>0){
            this.age=n2;
        }else {
            System.out.println("Invailed age");
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }

    static void main() {
        Encapsulation E1=new Encapsulation();
        E1.setName("Divyam");
        E1.setAge(46);
        System.out.println(E1.getName());
        System.out.println(E1.getAge());
    }


}

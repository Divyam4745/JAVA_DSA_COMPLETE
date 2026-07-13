package abstraction;

abstract class Bird {
    abstract void fly();
    abstract void eat();

    static class sparrow extends Bird{
        void fly(){
            System.out.println(" Sparrow flying");
        }
        void eat(){
            System.out.println(" Sparrow Eating");
        }
    }
    static class crow extends Bird{
        void fly(){
            System.out.println(" crow flying");
        }
        void eat(){
            System.out.println(" crow Eating");
        }
    }
    static void main() {
        Bird b=new sparrow();
        b.eat();
        b.fly();

        b=new crow();
        b.fly();
        b.eat();
    }
}

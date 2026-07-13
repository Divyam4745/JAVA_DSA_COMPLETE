package abstraction;

interface intereface {
    void fly();
    void eat();

    class Sparrow implements intereface{
        public void fly(){
            System.out.println("Sparrow flying");
        }

        @Override
        public void eat() {
            System.out.println("Sparrow eaing");
        }
    }

    static void main(String[] args) {
        intereface i=new Sparrow();
        i.eat();
        i.fly();
    }

}

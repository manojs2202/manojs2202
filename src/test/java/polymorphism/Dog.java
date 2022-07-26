package polymorphism;

public class Dog extends Animals {
    @Override
    public void eat(){
        System.out.println("Dog eat Biscuits");
    }

    @Override
    public void drink(){
        System.out.println("it drink water");
    }
    @Override
    public void tail(){
        System.out.println("It have tail");
    }

    @Override
    public void sleepHoues() {
        System.out.println("5 houre a day");
    }

}

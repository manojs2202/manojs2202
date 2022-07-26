package polymorphism;

public class Cat extends Animals {
    @Override
    public void sleepHoues() {
        System.out.println("6 hours a day");
    }
    @Override
    public void drink(){
        System.out.println("it can eat yogat");
    }
    @Override
    public void tail(){
        System.out.println("it has a tail");
    }
    @Override
    public void hunt(){
        System.out.println("it can't be hunt");
    }
}

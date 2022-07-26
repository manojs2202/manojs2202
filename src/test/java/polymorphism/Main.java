package polymorphism;

import org.checkerframework.checker.units.qual.A;

public class Main {
    public static void main(String[] args) {
        Animals d=new Dog();
        Animals c=new Cat();
        d.eat();d.sleepHoues();d.drink();d.tail();
        c.eat();c.sleepHoues();c.drink();c.tail();
    }

}

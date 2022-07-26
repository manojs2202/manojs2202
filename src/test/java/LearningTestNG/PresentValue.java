package LearningTestNG;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class PresentValue {
    @Test
    public static void value(){
        ArrayList<Integer> numbers=new ArrayList<>();
        //useing add() method to add elements
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        numbers.add(5);
        numbers.add(8);
        numbers.add(7);
        if (numbers.contains(1))
            System.out.println("1 is present");
        else
            System.out.println("1 is does not present");
    }
}

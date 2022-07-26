package PatternProgroms;

import PatternTest.Pattern01;
import org.testng.annotations.Test;

public class Pattern1 {
    @Test
    public static void pattern1() {
        for (int r = 1; r < 6; r++) {
            for (int c = 1; c < 6; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    @Test
    public static void print(){
            for (int  r = 1; r <=2; r++) {
                for (int c= 1; c<=4; c++) {
                    System.out.print("* ");
                }
                 System.out.println(" ");
            }
        }
    @Test
    public static void print1(){
        Pattern01.pattern(8);
    }
    }

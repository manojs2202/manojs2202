package DailyJAVA;

import org.testng.annotations.Test;

public class Segment {
    @Test
    public static void identifi(){
        String text ="I am working on selenium java";
        String[] arr =text.split(" ");
        System.out.println(arr.length);
    }

}

package Strings;

import org.testng.annotations.Test;

public class EqualsMethod {
    @Test
    public static void method() {
            String str = "Hell";
            String str1 = "Hello";
            String str2 = "Hello";
            boolean b = str1.equals(str2);
            System.out.println(b);
            b =	str.equals(str1) ;
            System.out.println(b);
        }
    }


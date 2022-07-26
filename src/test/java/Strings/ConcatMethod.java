package Strings;

import org.testng.annotations.Test;

public class ConcatMethod {
    @Test
    public static void concat(){
        String str1="Hello";
        String str2="World";
    //Concat() method is used to add two or more string into a single string object.
    // It is string class method and returns a string object.
        String str=str1.concat(str2);
        System.out.println(str);
    }
}

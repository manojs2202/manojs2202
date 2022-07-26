package Strings;

import org.testng.annotations.Test;

public class NewKeyword {
    @Test
    public static void keyWord(){
        //We can create a new string object by using new operator
        //that allocates memory for the object.
        String key=new String("Hello World");
        System.out.println(key);
    }
}

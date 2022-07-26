package Strings;

import org.testng.annotations.Test;

public class PlusOperator {
    @Test
    public static void operator(){
        String str1="hello";
        String str2="World";
        String str3=str1+str2;
        String strNum=str1+22;
        System.out.println(str3);
        System.out.println(strNum);
    }
}

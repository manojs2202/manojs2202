package DailyJAVA;

import org.testng.annotations.Test;

public class ReversString {
    @Test
    public static void string(){

            String str="charan", rstr=" ";
            char ch;
            for (int i=0;i<str.length();i++){
                ch=str.charAt(i);
                rstr=ch+rstr;
            }
            System.out.println("ReverseString:" +rstr);
        }
    }


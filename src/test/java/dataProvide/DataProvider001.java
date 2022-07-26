package dataProvide;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider001 {
    @Test(dataProvider = "getData")
    public void  adding(int num1,int num2,int expectedresult){
        int result;
        result=num1*num2;
        Assert.assertEquals(result, expectedresult);

    }
    @DataProvider(name = "getData")
    public Object[][] addData(){
        Object[][] data=new  Object[4][3];
        data[0][0]=3; data[0][1]=4;data[0][2]=12;
        data[1][0]=5;data[1][1]=2;data[1][2]=10;
        data[2][0]=7;data[2][1]=7;data[2][2]=49;
        data[3][0]=6;data[3][1]=5;data[3][2]=30;

        return data ;
        }

    }

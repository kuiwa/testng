package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.helper.Logger;

public class MyTest {

    @DataProvider(name = "data1")
    public Object[][] createData1() {
        return new Object[][] {
                { "Cedric", new Integer(36) },
                { "Anne" , new Integer(37) },
        };
    }

    @Test(dataProvider = "data1", groups = {"function"})
    public void verifyData1(String n1, Integer n2) {
        Logger.print("n1 = " + n1);
        Logger.print("n2 = " + n2);
        Logger.printEnd();
    }

    @Test(dataProvider = "data2", dataProviderClass = StaticProvider.class)
    public void verifyData2(Integer n1) {
        Logger.print("n1 = " + n1);
        Logger.printEnd();
    }

    @Test
    public void test() {
        Logger.print("This is a data provider testing");
    }

}

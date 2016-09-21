package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.helper.Logger;


public class TestBean {
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { { new Bean("hi I am the bean", 111) } };
    }

    @Test(dataProvider = "test1")
    public void testMethod(Bean myBean) {
        Logger.print(myBean.getVal() + " " + myBean.getI());
    }
}

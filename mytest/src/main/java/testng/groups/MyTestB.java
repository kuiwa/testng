package testng.groups;

import org.testng.annotations.Test;

import testng.helper.Logger;

public class MyTestB{

    String[] name = this.getClass().getName().split("\\.");
    String methodName;

    @Test(groups = {"group2"})
    public void testB1() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
        Logger.printEnd();
    }

    @Test(groups = {"group4"})
    public void testB2() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
//        Assert.assertTrue(false);
        Logger.printEnd();
    }
}
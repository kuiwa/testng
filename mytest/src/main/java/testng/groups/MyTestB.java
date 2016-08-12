package testng.groups;

import org.testng.annotations.Test;

import testng.helper.Logger;

public class MyTestB{

    String[] name = this.getClass().getName().toString().split("\\.");

    @Test(groups = {"group2"})
    public void testB1() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
    }

    @Test(groups = {"group4"})
    public void testB2() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        String[] name = this.getClass().getName().toString().split("\\.");
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
        Logger.print("test logger");
    }
}

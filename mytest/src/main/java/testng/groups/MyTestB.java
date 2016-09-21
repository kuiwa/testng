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

    @Test(groups = {"group5"})
    public void testGroup5() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
        Logger.printEnd();
    }

    @Test(groups = {"group6"})
    public void testGroup6() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
        Logger.printEnd();
    }

    @Test(groups = {"group7"})
    public void testGroup7() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
        Logger.printEnd();
    }

    @Test(groups = {"group8"})
    public void testGroup8() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length - 1] + "." +  methodName);
        Logger.printEnd();
    }
}
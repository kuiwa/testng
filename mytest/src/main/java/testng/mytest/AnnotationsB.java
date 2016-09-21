package testng.mytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testng.helper.Logger;

public class AnnotationsB {

    String[] name = this.getClass().getName().split("\\.");
    String methodName;

    @BeforeSuite
    public void beforeSuite() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @BeforeTest
    public void beforeTest() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @BeforeGroups
    public void beforeGroups() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @BeforeClass
    public void beforeClass() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @BeforeMethod
    public void beforeMethod() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @Test(groups = { "groupA" })
    public void testA() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @Test(groups = { "groupB" })
    public void testB() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @AfterMethod
    public void afterMethod() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @AfterClass
    public void afterClass() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @AfterGroups
    public void afterGroups() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @AfterTest
    public void afterTest() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

    @AfterSuite
    public void afterSuite() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }
}

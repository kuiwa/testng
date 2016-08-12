package testng.groups;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testng.helper.Logger;

public class MyTest{

    @Test(timeOut = 2 * 3600 * 1000, groups = {"property", "vmarguments", "group2"})
    @Parameters({"property1","property2"})
    public void testProperty(String property1, @Optional("") String property2) {
        Logger.print("VM arguments");
        String syspro1 = property1;
        Logger.print(syspro1 + "=" + System.getProperty(syspro1));
        String syspro2 = property2;
        Logger.print(syspro2 + "=" + System.getProperty(syspro2));
        Logger.printEnd();
    }

    @Test(groups = {"group3", "group2"}, dependsOnGroups = {"group4"}, alwaysRun = false)
    @Parameters({"group1A"})
    public void testGroup1A(String group1A) {
        Logger.print("This is testGroup1A.");
        Logger.print(group1A);
        Logger.printEnd();
    }

    @Test(groups = {"group1"})
    public void testGroup1B() {
        Logger.print("This is testGroup1B");
        Logger.printEnd();
    }

    @Test(groups = {"group1"})
    public void testGroup1C() {
        Logger.print("This is testGroup1C");
        Logger.printEnd();
    }
}
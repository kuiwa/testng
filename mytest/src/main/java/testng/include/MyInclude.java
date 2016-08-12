package testng.include;

import org.testng.annotations.Test;

import testng.helper.Logger;


public class MyInclude {

    String[] name = this.getClass().getName().split("\\.");
    String methodName;

    @Test(groups = {"grat","robustness"}, enabled = false)
    public void testInclude() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.print("This is " + name[name.length -1] + "." + methodName);
        Logger.printEnd();
    }

    @Test(groups = {"grat","stability"})
    public void testExclude() {
        methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        Logger.printName(name, methodName);
    }

}

package testng.dataprovider;

import org.testng.annotations.DataProvider;

public class StaticProvider {

        @DataProvider(name = "data2", parallel = true)
        // Object[][], 第一个方括号是方法被调用的次数，
        // 第二个方括号是被调用对象的数组，被调用对象的类型必须与调用方法一致，否则运行结果将是skip
        public static Object[][] createData() {
            return new Object[][] {
                    new Object[] { new Integer(42) },
                    new Object[] { new Integer(43) }
            };
        }
}

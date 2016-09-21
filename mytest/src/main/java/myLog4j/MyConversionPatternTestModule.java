package myLog4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class MyConversionPatternTestModule {

    private static Logger logger = Logger.getLogger(MyConversionPatternTestModule.class);
    @Test
    public static void testModule() {
        logger.info("This is info message");
        logger.debug("This is debug message");
        logger.error("This is error message") ;
    }
}

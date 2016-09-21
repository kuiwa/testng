package myLog4j;

import org.apache.log4j.Logger;
public class MyConversionPattern{
    private static Logger logger = Logger.getLogger(MyConversionPattern.class);
    public static Logger getLogger( String name) {
        return Logger.getLogger (name);
    }

}

package testng.helper;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.testng.annotations.Test;

public class Logger {
//
    final private static SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS");
    
    @Test(groups = {"group2"})
    public static void print(String message) {
        Date date= new Date();
        System.out.print(date_format.format(date));
        System.out.print("  ");
        System.out.println(message);
    }
}


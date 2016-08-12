package testng.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    final private static SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS");

    public static void printName(String[] className, String methodName) {
        print("This is " + className[className.length -1] + "." + methodName);
    }

    public static void printEnd() {
        print("Finished!");
    }

    public static void print(String message) {
        Date date= new Date();
        System.out.print(date_format.format(date));
        System.out.print("  ");
        System.out.println(message);
    }
}
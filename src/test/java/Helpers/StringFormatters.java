package Helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFormatters {
    public static String getUniqueString(String str){
        return str + new SimpleDateFormat("yyyyMMdd-hhmmss").format(new Date());
    }
}



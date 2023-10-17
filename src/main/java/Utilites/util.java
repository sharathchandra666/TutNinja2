package Utilites;

import java.util.Date;

public class util {
    public static String EmailTimestamp()
    {
        Date date=new Date();
        String RandomEmail = date.toString().replace(" ", "_").replace(":", "_");
        return "sharathchandra"+RandomEmail+"@gmail.com";
    }
}

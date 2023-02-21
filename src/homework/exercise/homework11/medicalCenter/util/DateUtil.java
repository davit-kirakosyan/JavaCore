package homework.exercise.homework11.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    public static String toDateString(Date date){
        if (date == null){
            return null;
        }
        return SIMPLE_DATE_FORMAT.format(date);
    }
    public static Date toDateString(String dateStr) throws ParseException {
        if (dateStr == null){
            return null;
        }
        return SIMPLE_DATE_FORMAT.parse(dateStr);
    }

    public static String toStringDate(Date date){
        if (date == null){
            return null;
        }
        return SDF.format(date);
    }
}

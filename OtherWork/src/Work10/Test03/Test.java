package Work10.Test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {

        Date d= new Date();

        String s = changeDate.dateToS(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);

        String s2 = changeDate.dateToS(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = changeDate.dateToS(d, "HH:mm:ss");
        System.out.println(s3);

        String str = "2080-08-08 12:23:34";
        Date dd = changeDate.StoDate(str, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}



//
class changeDate{
    public changeDate() {
    }

    public static String dateToS(Date date, String rule){
        SimpleDateFormat sdf= new SimpleDateFormat(rule);
        String s=sdf.format(date);
        return s;
    }

    public static Date StoDate(String s,String rule) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat(rule);
        Date d=sdf.parse(s);
        return d;
    }
}
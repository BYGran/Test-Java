package ClassTest.DateDemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名：");
        String name=sc.next();
        System.out.println("出生日期：");
        String s=sc.next();
        Date d=StoDate(s);
        String s1 = DateFormat.getDateInstance().format(d);
        System.out.println(s1);
        Student st=new Student(name,d);
        st.show();

    }

    public static Date StoDate(String s) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        return d;
    }


}


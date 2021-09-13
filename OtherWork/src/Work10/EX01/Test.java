package Work10.EX01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：");
        String birth=sc.next();


        System.out.println("请输入当前日期：");
        String now=sc.next();

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        Date b=sdf.parse(birth);
        Date n=sdf.parse(now);

        long b1=b.getTime();
        long n1=n.getTime();

        System.out.println((n1-b1));
    }
}

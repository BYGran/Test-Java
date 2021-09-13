package Work09.Test04;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        StringBuilder builder=new StringBuilder(c);
        builder.reverse();
        c=builder.toString();
        System.out.println(c);
    }
}

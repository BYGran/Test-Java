package ClassTest.Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder b= new StringBuilder("saavgvdgbaf");
//        System.out.println("请输入：");
//        String s= sc.next();
        String s=b.toString();
        int count=0;

        char a[]=s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if(a[i]=='a')
                count++;
        }

        System.out.println(count);
    }
}

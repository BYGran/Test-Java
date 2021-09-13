package Work09.EX04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入：");
        String xx=sc.next();
        char a[]=new char[xx.length()];
        for (int i = 0; i < a.length; i++) {
            a[i]=xx.charAt(i);
            System.out.print(a[i]);

            if(a[i]>='A'&&a[i]<='Z'){
                a[i]+=32;
            }
        }
        System.out.println();
        if(a[0]!=a[a.length-1]){
            char t=a[a.length-1];
            a[a.length-1]=a[0];
            a[0]=t;
        }
        for (int i = 1; i < xx.length(); i++) {
            if(i%2==0){
                a[i]='~';

            }
        }
        for (int i = 0; i < xx.length(); i++) {
            System.out.print(a[i]);
        }
    }
}

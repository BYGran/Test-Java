package ClassTest.Test;

import java.util.Scanner;

public class Test03 {
    public  static int x=0,d=0,sz=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入：");
        String s=sc.next();
        tj(s);
        show();

    }

    public static void tj(String s){
        char a[]=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>='a'&&a[i]<='z'){
                x++;
            }else if(a[i]>='A'&&a[i]<='Z'){
                d++;
            }else if(a[i]>='0'&&a[i]<='9'){
                sz++;
            }
        }

    }

    public static void show(){
        System.out.println("大写："+d);
        System.out.println("小写："+x);
        System.out.println("数字："+sz);
    }
}

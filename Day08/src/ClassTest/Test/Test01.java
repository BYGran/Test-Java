package ClassTest.Test;

import java.util.Scanner;

public class Test01 {
    public  static String name="admin";
    public  static String psw="123456";

    public static void main(String[] args) {
        check();
    }


    public static void check(){
        Scanner sc = new Scanner(System.in);
        int n=3;
        while (n>0){
            System.out.println("请输入用户名：");
            String na = sc.next();

            System.out.println("请输入密码：");
            String p = sc.next();

            if(na.equals(name)&&p.equals(psw)){
                System.out.println("登录成功！");
                break;
            }else {
                n--;
                if(n==0){
                    System.out.println("结束");
                    break;
                }else {
                    System.out.println("失败,还有"+n+"次机会");
                }
            }
        }
    }
}

package Work09.Test02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name="admin";
        String psw="123456";
        int ck=3;
        while (ck>0){
            System.out.println("还有"+ck+"次机会");
            System.out.println("用户名：");
            String a=sc.next();
            System.out.println("密码：");
            String b=sc.next();
            if(a.equals(name)&&b.equals(psw)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
                ck--;
            }
        }
    }
}

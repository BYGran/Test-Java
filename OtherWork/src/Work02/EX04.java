package Work02;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入4位会员卡号：");
            int x=sc.nextInt();
            int g=x%10;
            int s=x/10%10;
            int b=x/100%10;
            int q=x/1000%10;
            int sum=g+s+b+q;
            System.out.println("会员卡号"+x+"各位之和为"+sum);
            if(sum>20){
                System.out.println("会员卡号"+x+"是幸运客户");
            }else
                System.out.println("会员卡号"+x+"不是幸运客户");
        }
    }
}

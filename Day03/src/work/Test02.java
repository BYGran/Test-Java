package work;
import java.util.*;
public class Test02 {
    public static void main(String[] args) {
       Scanner xx = new Scanner(System.in);
        System.out.println("请输入您的取款金额");
        int m=xx.nextInt();
        while(m<0||m>10000||m%100!=0){
            System.out.println("输入错误, 请重新输入:");
            m=xx.nextInt();
        }
        System.out.println("请取走您的现金:"+m);
    }
}

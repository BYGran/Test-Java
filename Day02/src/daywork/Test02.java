package daywork;
import java.util.*;
public class Test02 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = xx.nextInt();
        int a,b,c;
        a=num%10;
        b=num/10%10;
        c=num/100%10;
        int sum=a+b+c;
        System.out.println("个位数是："+a);
        System.out.println("十位数是："+b);
        System.out.println("百位数是："+c);
        System.out.println("三个数字相加后的结果是："+sum);
    }
}

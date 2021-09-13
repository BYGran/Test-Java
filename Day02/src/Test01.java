import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        int num1=xx.nextInt();
        int num2=xx.nextInt();
        int num3=xx.nextInt();
        int min,max,t;
        t=num1>=num2?num1:num2;
        max=t>=num3?t:num3;
        t=num1<=num2?num1:num2;
        min=t<=num3?t:num3;
        int mid=num1+num2+num3-min-max;
        System.out.println("最大"+max);
        System.out.println("最小"+min);
        System.out.println(mid);
        System.out.printf("%d %d %d",min,mid,max);
    }
}

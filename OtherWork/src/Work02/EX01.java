package Work02;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入小明左手中的牌：");
            int l=sc.nextInt();
            System.out.println("请输入小明右手中的牌：");
            int r=sc.nextInt();
            System.out.println();
            System.out.println("互换前小明手中的纸牌：");
            System.out.println("左手中的纸牌："+l);
            System.out.println("右手中的纸牌："+r);
            System.out.println();
            int t=r;
            r=l;
            l=t;
            System.out.println("互换后小明手中的纸牌：");
            System.out.println("左手中的纸牌："+l);
            System.out.println("右手中的纸牌："+r);
            System.out.println();
        }
    }
}

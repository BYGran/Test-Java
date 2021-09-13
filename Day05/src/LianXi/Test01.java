package LianXi;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        check(x);
    }

    public static void check(int c){
        if(c%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }


}

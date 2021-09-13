package Demo;

import java.util.*;
public class Test4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       xx(n,1);
    }
    static void xx(int n,int s){
        if(n>1){
            s=(1+s)*2;
            n--;
            xx(n,s);
        }
        System.out.println(s);
        System.exit(0);
    }
}

package work;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        int  [] a= new int [5];
        Random xx= new Random();
        for(int i=0;i<a.length;i++){
            a[i]=xx.nextInt(61)+20;
            System.out.println(a[i]);
        }
    }
}

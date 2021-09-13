package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        for (int i = 0; i < 6; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        double avg=(a[1]+a[2]+a[3]+a[4])*1.0/4;
        System.out.println(avg);
    }
}

package Work04;

import java.util.Arrays;
import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] =new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int avg=(a[1]+a[2]+a[3]+a[4])/4;
        System.out.println(avg);
    }
}

package Demo;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int a[]=new int[n];
            int avg=0,c0=0,c1=0,c2=0;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                avg+=a[i];
            }
            avg=avg/n;
            for (int i = 0; i < n; i++) {
                if(a[i]==avg){
                    c0++;
                }else if(a[i]<avg){
                    c1++;
                }else
                    c2++;
            }
            System.out.println(c1+" "+c0+" "+c2);
        }
    }
}

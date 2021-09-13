package Work02;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b=sc.nextInt();
        double n1=b*1.0*0.0225+b*1.0;
        double n2=b*1.0*0.027+b*1.0;
        System.out.printf("%.1f\n",b);
        System.out.println(n1);
        System.out.println(n2);
    }
}

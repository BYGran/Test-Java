package LianXi;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] a=new double[3];
        for (int i = 0; i < 3; i++) {
            a[i]=sc.nextDouble();
        }
        System.out.println(sort(a));
        print2(min(a));
    }
    public static double min(double a[]){
        double min=a[0]<=a[1]?a[0]:a[1];
        min=min<=a[2]?min:a[2];
        return min;
    }

    public static void print2(double x){
        System.out.println(x);
    }

    public static double sort(double a[]){
        Arrays.sort(a);
        return a[0];
    }
}


//{2,2,4,4},
//        {2,2,0,8},
//        {0,0,0,8},
//        {2,0,0,8}
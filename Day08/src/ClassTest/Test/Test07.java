package ClassTest.Test;

import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
        int[] arr=new int[5];

        Random r= new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(99)+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int count=getScore(arr);
        System.out.println(count);
    }

    public static int getScore(int[] arr){
        int avg=0,c=0;
        for (int i = 0; i < arr.length; i++) {
            avg+=arr[i];
        }
        avg=avg/5;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                c++;
            }
        }
        return c;
    }
}

package Work04;

import java.util.Random;

public class T02 {
    public static void main(String[] args) {
        int[] a=new int[3];
        Random r=new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(10);
            System.out.print(a[i]+"\t");
        }
    }
}

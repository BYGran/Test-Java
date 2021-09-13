package Lianxi;

import java.util.*;
public class RandomTest {
    public static void main(String[] args) {
        Random ra=new Random();
        Scanner sc=new Scanner(System.in);
        int random=ra.nextInt(100)+1;
//        while (true){
//            int c=sc.nextInt();
//            if(c>random){
//                System.out.println("大");
//            }else if (c<random){
//                System.out.println("小");
//            }else {
//                System.out.println("Yes");
//                break;
//            }
//        }

        int []a=new int[100];
        for(int i=0;i<100;i++){
            a[i]=i;
        }
        int l=0,r=0,mid=a.length/2;
        while(a[mid]!=random){
            if(random<a[mid]){
                r=mid;
                mid=(l+r)/2;
            }else if(a[mid]<random){
                l=mid;
                mid=(l+r)/2;
            }
        }
        System.out.println(random);
        System.out.println(a[mid]);

    }

}

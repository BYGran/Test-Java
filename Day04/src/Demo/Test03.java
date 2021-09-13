package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        for (int i = 0; i < n; i++) {

            for (int j=0;j<3;j++){
                s[i]+=sc.nextInt();
            }
        }
        Arrays.sort(s);
//        int t=0;
//        for (int i = 0; i < n; i++) {
//
//            for(int j=i+1;j<n;j++){
//                if(s[i]<s[j]){
//                    t=s[i];
//                    s[i]=s[j];
//                    s[j]=t;
//                }
//            }
//        }
        for (int i = n-1; i >=0; i--) {
            System.out.println(s[i]);
        }

    }
}

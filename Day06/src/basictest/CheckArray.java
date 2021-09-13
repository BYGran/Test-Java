package basictest;

import java.util.Arrays;

public class CheckArray {
    public static void main(String[] args) {
        int[] s1 = {11, 22, 33, 44, 55};
        //int[] arr2 = {11, 22, 33, 44, 55};
        int[] s2 = {11, 22, 33, 44, 5};
        //字符数组转换成字符串
        String x= Arrays.toString(s1);
        String x2= Arrays.toString(s2);
        System.out.println(x.equals(x2));
//        System.out.println(check(s1,s2));
    }
//    static boolean check(int []s1,int []s2){
//        boolean f=true;
//       if()
//        return f;
//    }
}

package Work09.EX02Important;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String small;
        String big;
        System.out.println("请输入长字符串：");
        big=sc.next();
        System.out.println("请输入长字符串：");
        small=sc.next();
//        System.out.println(getc(small,big));
        System.out.println(get2(small,big));
    }

    public static int getc(String small,String big){
        int index=0,count=0;
        while((index=big.indexOf(small,index))!=-1){
            index++;
            count++;
        }
        return count;
    }

    public static int get2(String small,String big){
        int count=0;
        while(big.contains(small)){
            count++;
            big=big.replaceFirst(small,"");
        }
        return count;
    }
}

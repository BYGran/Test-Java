package ClassTest.Test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int count=0;
            int index1=-1;
            int index2=-1;
            System.out.println("请输入：");
            String sr= sc.next();
            while((index1=sr.indexOf("tmd",index1))!=-1){
                index1++;
                count++;
            }
            while((index2=sr.indexOf("TMD",index2))!=-1){
                index2++;
                count++;
            }
            sr=sr.replaceAll("tmd","***");
            sr=sr.replaceAll("TMD","***");
            System.out.println(count);
            System.out.println(sr);
        }

    }
}

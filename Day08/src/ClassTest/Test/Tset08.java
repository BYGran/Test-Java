package ClassTest.Test;

import java.util.Scanner;

public class Tset08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=sc.next();
        StringBuilder b1=new StringBuilder();
        StringBuilder b2=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                b1.append(s.charAt(i));
            }else if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                b2.append(s.charAt(i));
            }
        }
        b1.append(b2);
        String news=b1.toString();
        System.out.println(news);
    }
}

package Work09.EX05;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        char a[]=new char[26];
        int index=0;
        for(char i='A';i<='Z';i++){
            a[index++]=i;
        }
        System.out.println(getStr(a));
    }

    public static String getStr(char a[]){
        Random r= new Random();
        String x="";
        for (int i = 0; i < 4; i++) {
            x+=a[r.nextInt(26)];
        }
        x+=r.nextInt(10);
        return x;
    }
}

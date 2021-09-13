package basictest;
import java.lang.reflect.Array;
import java.util.*;
public class CheckNum {
    public static void main(String[] args) {
        Random r=new Random();
//        定义一个字符数组来组合字符
        String x ="";
        char []a=new char[5];
//        调用getRandom()方法获取一个随机数取值范围
        char []fw=getRandom();
        for(int i=0;i<a.length;i++){
            a[i]=fw[r.nextInt(fw.length)];
            x+=a[i];
        }
        System.out.println(x);
    }
    static char[] getRandom(){
        char []fanwei=new char[62];
        int x=0;
        for(char i='a';i<='z';i++){
            fanwei[x++]=i;
        }
        for(char i='A';i<='Z';i++){
            fanwei[x++]=i;
        }
        for(char i='0';i<='9';i++){
            fanwei[x++]=i;
        }
        return fanwei;
    }
}

package basictest;
import java.util.*;
public class CheckPosition {
    public static void main(String[] args) {
        //定义静态数组
        int [] arr= {19, 28, 37, 46, 50};
        int num;
        Scanner xx= new Scanner(System.in);
        num=xx.nextInt();
        // 调用check()方法并打印返回值
        System.out.println(check(num,arr));
    }
    static int check(int num,int []arr){
        //默认为查找不到（-1）
        int l=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                l=i;
                break;
            }
        }
        return l;
    }
}

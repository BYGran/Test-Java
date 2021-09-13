package basictest;
import java.util.*;
public class GetScore {
    public static void main(String[] args) {
        int []a= new int[6];
        Scanner xx=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=xx.nextInt();
        }

        System.out.println("得分为"+gets(a));
    }
    static int gets(int []a){
        int t,sum=0;
        //对数组进行从小到大的排序
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>=a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        sum=a[1]+a[2]+a[3]+a[4];
        return sum;
    }
}

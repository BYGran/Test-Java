package work;
import java.util.*;
public class Test01 {
    public static void main(String[] args) {
      int max;
      int [] a=new int[3];
      Scanner xx=new Scanner(System.in);
      for(int i=0;i<3;i++){
          a[i]=xx.nextInt();
      }
      max=getmax(a[0],a[1],a[2]);
        System.out.println(max);
    }
    static int getmax(int a, int b, int c){
        int max;
        int t=a>b?a:b;
        max=t>c?t:c;
        return max;
    }
}

package work;
import java.util.*;
public class Test02 {
    public static void main(String[] args) {
        Scanner xx= new Scanner(System.in);
        int min,i,k=xx.nextInt();
        int [] a= new int[k];
        for(i=0;i<a.length;i++){
            a[i]=xx.nextInt();
        }
        min=a[0];
        for(i=0;i<a.length;i++){
            if(a[i]<=min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}

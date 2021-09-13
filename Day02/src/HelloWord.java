import java.util.*;
public class HelloWord {
    public static void main(String[] args) {
        int i,j;
        int x;
        Scanner br=new Scanner(System.in);
        x=br.nextInt();
        for(i=0;i<x;i++){
            for(j=0;j<=i;j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

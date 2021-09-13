package Demo;

public class Test5 {
    public static void main(String[] args) {
        int a[][] = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            int x=0;
            for (int j = 0; j < a[i].length; j++) {
                x+=a[i][j];
                sum+=a[i][j];
            }
            System.out.print(x+"\t");
        }
        System.out.println();
        System.out.println(sum);
    }
}

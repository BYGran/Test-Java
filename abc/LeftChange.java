public class LeftChange {
    public static void main(String[] args) {
        int a[][]={
                {2,2,4,4},
                {2,2,0,8},
                {0,0,0,8},
                {2,0,0,8}
        };
        int c[][]=new int[4][4];

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=a[3-j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}

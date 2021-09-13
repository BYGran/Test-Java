public class LeftTest {
    public static void main(String[] args) {
        int a[][]={
                {2,2,4,4},
                {2,2,0,8},
                {0,0,0,8},
                {2,0,0,8}
        };
        int b[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            int l=0;
            for (int j = 0; j < 4; j++) {
                if(a[i][j]!=0){
                    b[i][l++]=a[i][j];
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-1; j++) {
                if(b[i][j]==b[i][j+1]){
                    b[i][j]*=2;
                    for(int k=j+1;k<b.length-1;k++){
                        b[i][k]=b[i][k+1];
                    }
                    b[i][3]=0;
                }
            }
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }



    }
}

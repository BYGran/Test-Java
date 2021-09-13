package work;

public class Test03 {
    public static void main(String[] args) {
        int i, j;
        int[][] a = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99},
                {11, 22, 33}
        };
        for (i = 0; i < a.length; i++) {
            int sum = 0;
            for (j = 0; j < a[i].length; j++) {

                sum += a[i][j];
            }
            System.out.println("第" + i + "个季度的营业额为" + sum);

        }
    }
}

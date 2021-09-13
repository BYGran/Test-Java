package Work04;

public class T03 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int a[]=new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i]=nums[i]*2;
            System.out.print(a[i]+"\t");
        }
    }
}

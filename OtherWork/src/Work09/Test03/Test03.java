package Work09.Test03;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String x = "[";
        for (int i = 0; i < arr.length; i++) {
           if(i!=arr.length-1){
               x+=arr[i]+",";
           }else {
               x+=arr[i];
           }
        }
        x+="]";
        System.out.println(x);
    }
}

package Work09.Test05;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        StringBuilder b=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                b.append(arr[i]);
                b.append(",");
            }else{
                b.append(arr[i]);
            }
        }
        b.append("]");
        System.out.println(b);
    }
}
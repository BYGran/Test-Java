package basictest;

public class ArrayReverse {

    public static void main(String[] args) {
        int arr[]={19,28,37,46,50};
        method1(arr);
    }

    public static void method1(int arr[]){
        int x[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            x[arr.length-1-i]=arr[i];
        }

    }

    public static void method2(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            arr[i]=arr[arr.length-1-i];
        }
    }

//    public static void print(){
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i]+" ");
//        }
//        System.out.println();
//    }
}

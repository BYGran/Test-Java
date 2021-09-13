package LianXi;

public class Test03 {
    public static void main(String[] args) {
        int a[]={55,44,33,22,11};
        print(a);
    }
    public static void print(int a[]){
        System.out.print("[");
        for (int i = a.length-1; i >=0; i--) {
            if(i==0){
                System.out.println(a[i]+"]");
            }else
                System.out.print(a[i]+",");
        }
    }
}

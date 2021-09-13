package basictest;

public class SumArray {
    public static void main(String[] args) {
        int [] a={68,27,95,88,171,996,51,210};
        int sum=0;
        for(int i=0;i<a.length;i++){
            int g,s;
            g=a[i]%10;
            s=a[i]/10%10;
            if(a[i]%2==0&&g!=7&&s!=7){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}

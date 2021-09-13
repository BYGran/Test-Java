package work;

public class Test03 {
    public static void main(String[] args) {
        int count=0;
        int num=1000;
        int g,s,b,q;
        while(num<10000){
            g=num%10;
            s=num/10%10;
            b=num/100%10;
            q=num/1000%10;
            if(g+b==s+q){
                System.out.println(num);
                count++;
            }
            num++;
        }
        System.out.println("个数为"+count);
    }
}

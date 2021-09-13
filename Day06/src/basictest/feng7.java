package basictest;

public class feng7 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            int g,s;
            g=i%10;
            s=i/10%10;
            if(i%7==0||g==7||s==7){
                System.out.println(i);
            }
        }
    }
}

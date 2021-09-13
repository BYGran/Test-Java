package Lianxi;

public class WhileTest {
    public static void main(String[] args) {
        int i=999;
        while (i>99){
            int g,s,b;
            g=i%10;
            s=i/10%10;
            b=i/100%10;
            if(g*g*g+s*s*s+b*b*b==i){
                System.out.println(i);
            }
            i--;
        }
    }
}

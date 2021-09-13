package work;

public class Test01 {
    public static void main(String[] args) {
        for(int i=1988;i<=2020;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                System.out.println(i);
            }
        }
    }
}

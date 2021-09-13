package daywork;
import java.util.*;
public class Test04 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int score = xx.nextInt();
        int s=score;
        if(s>=90&&s<=100){
            System.out.println("优秀");
        }else if(s>=80&&s<=89){
            System.out.println("好");
        }else if(s>=70&&s<80){
            System.out.println("良");
        }else if (s>=60&&s<70){
            System.out.println("及格");
        }else if(s<60&&s>=0){
            System.out.println("不及格");
        }else{
            System.out.println("输入不规范!");
        }
    }
}

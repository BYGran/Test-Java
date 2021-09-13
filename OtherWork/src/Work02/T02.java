package Work02;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        if(x>=60){
            System.out.println("及格");
        }else if(x>=0){
            System.out.println("不及格");
        }else {
            System.out.println("不符合规范");
        }
    }
}

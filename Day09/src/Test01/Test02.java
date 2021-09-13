package Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
            add(list);

    }

    public static void add(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        int n=1;
        while(n<=3){
            System.out.println(n+"请输入姓名：");
            String name=sc.next();
            System.out.println(n+"请输入年龄：");
            Integer age=sc.nextInt();
            list.add(new Student(name,age));
            n++;
        }
    }
}

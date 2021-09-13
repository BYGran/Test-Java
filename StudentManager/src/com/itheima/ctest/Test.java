package com.itheima.ctest;

import com.itheima.bean.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static ArrayList<Student> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student stu1 = new Student("heima001","张三",23,"1999-11-11");
        Student stu2 = new Student("heima002","李四",24,"1999-11-12");
        Student stu3 = new Student("heima003","王五",25,"1999-12-11");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        while(true){
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("增");
                    addS();
                }
                case 2 -> {
                    System.out.println("删");
                    delete();
                }
                case 3 -> {
                    System.out.println("改");
                    update();
                }
                case 4 -> {
                    System.out.println("查");
                    select();
                }
                case 5 -> System.exit(0);
                default -> System.out.println("您输入有误请重新输入");
            }

        }
    }

    public static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id=sc.next();
        int index=check(id);
        if(index==-1){
            System.out.println("已存在该学生！");
        }else {
            System.out.println("请输入姓名：");
            String name=sc.next();
            System.out.println("请输入年龄：");
            int age=sc.nextInt();
            System.out.println("请输入生日：");
            String birth=sc.next();
            Student st= new Student(id,name,age,birth);
            list.set(index,st);
            System.out.println("修改成功");
        }
    }

    public static void delete() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学号：");
        String id=sc.next();
        int index=check(id);
        if(index==-1){
            System.out.println("该学生不存在");
        }else {
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void select() {
        if(list.size()==0)
            System.out.println("无数据！");
        else{
            for (int i = 0; i < list.size(); i++) {
                Student s=list.get(i);
                System.out.println(s.getId()+"--"+s.getName()+"--"+s.getAge()+"--"+s.getBirth());
            }
        }
    }

    public static void addS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id=sc.next();
        int index=check(id);
        if(index!=-1){
            System.out.println("已存在该学生！");
        }else {
            System.out.println("请输入姓名：");
            String name=sc.next();
            System.out.println("请输入年龄：");
            int age=sc.nextInt();
            System.out.println("请输入生日：");
            String birth=sc.next();
            Student st= new Student(id,name,age,birth);
            list.add(st);
            System.out.println("成功");
        }
    }

    public static int check(String id) {
        int c=-1;
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(id.equals(s.getId())){
                c=i;
                break;
            }
        }
        return c;
    }
}

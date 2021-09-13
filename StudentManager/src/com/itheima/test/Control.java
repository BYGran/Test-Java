package com.itheima.test;

import com.itheima.bean.Student;

import java.util.*;

public class Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      创建Student对象集合
        ArrayList<Student> st = new ArrayList<>();
//      添加三组测试数据
        Student st1 = new Student("h123", "小a", 18, "2000-1-1");
        Student st2 = new Student("h1234", "小b", 20, "2005-1-1");
        Student st3 = new Student("h12345", "小b", 26, "1995-1-1");
        st.add(st1);
        st.add(st2);
        st.add(st3);
        lo:
        while (true) {
            System.out.println("------------------------");
            System.out.println("1 查看学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("------------------------");
            System.out.println("请选择:");
//          choice为功能选项
            int choice = sc.nextInt();
            if (choice > 5 || choice < 1) {
                System.out.println("目前没有该功能，请重新选择！");
            } else {
                switch (choice) {
                    case 1:
                        select(st);
                        break;
                    case 2:
                        add(st);
                        break;
                    case 3:
                        delete(st);
                        break;
                    case 4:
                        update(st);
                        break;
                    case 5:
//                       退出系统，跳出到while循环外，程序结束运行
                        System.out.println("---感谢使用---");
                        break lo;
                }
            }

        }
    }

    private static void update(ArrayList<Student> st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("请输入需待修改学生学号：");
        String id = sc.next();
//        检查学号是否存在
        int c = checkdel(st, id);
        if (c == -1) {
            System.out.println("不存在该学生！！请确认后重新输入");
        } else {
//            调用学号查询方法，显示原信息
            System.out.println("------------------------");
            System.out.println("原信息：");
            selectbyid(st, id);
            System.out.println("------------------------");
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入出生日期：");
            String birth = sc.next();
            Student student = new Student(id, name, age, birth);
            st.set(c, student);
            System.out.println("------------------------");
            System.out.println("修改成功！");
        }
    }

    //    通过学号删除方法
    private static void delete(ArrayList<Student> st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("请输入需删除的学号：");
        String id = sc.next();
        int c = checkdel(st, id);
        if (c == -1) {
            System.out.println("不存在该学生！！");
        } else {
            System.out.println("------------------------");
            System.out.println("确认是否删除：");
            System.out.println();
            selectid(st,id);
            System.out.println("------------------------");
            System.out.println("1 确定");
            System.out.println("2 取消");
            System.out.println("------------------------");
            while(true){
                int delck=sc.nextInt();
                if(delck==1){
                    st.remove(c);
                    System.out.println("------------------------");
                    System.out.println("删除成功！！");
                    break;
                }else if(delck==2){
                    System.out.println("已取消!");
                    break;
                }else {
                    System.out.println("------------------------");
                    System.out.println("输入的命令有误！请重新输入：");
                }
            }
        }
    }

//    验证学号并获取位置
    private static int checkdel(ArrayList<Student> st, String id) {
        for (int i = 0; i < st.size(); i++) {
            Student student = st.get(i);
//            当输入的学号存在时，返回该学号在集合中位置i
            if (student.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

//    添加方法
    private static void add(ArrayList<Student> st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("学号：");
        String id = sc.next();
//        调用checkid()，检查学号是否存在
        int c = checkid(st, id);
        if (c == 1) {
            System.out.println("------------------------");
            System.out.println("学号重复！！");
        } else {
            System.out.println("姓名：");
            String name = sc.next();
            System.out.println("年龄：");
            int age = sc.nextInt();
            System.out.println("出生日期：");
            String birth = sc.next();
            Student student = new Student(id, name, age, birth);
            st.add(student);
            System.out.println("------------------------");
            System.out.println("添加成功!");
        }

    }

//    学号重复验证方法
    static int checkid(ArrayList<Student> st, String id) {
        for (int i = 0; i < st.size(); i++) {
            Student student = st.get(i);
            if (student.getId().equals(id)) {
                return 1;
            }
        }
        return 0;
    }

//    查询方式选择页
    static void select(ArrayList<Student> st) {
        Scanner sc = new Scanner(System.in);
//        验证集合是否存在信息
        if (st.size() == 0) {
            System.out.println("------------------------");
            System.out.println("无学生信息！");
        } else {
            System.out.println("------------------------");
            System.out.println("请选择查询方式：");
            System.out.println("1 学号查询");
            System.out.println("2 姓名查询");
            System.out.println("3 全部学生");
            System.out.println("4 上一层");
            System.out.println("------------------------");
            int selectch = sc.nextInt();
            switch (selectch) {
                case 1:
                    System.out.println("------------------------");
                    System.out.println("请输入需查询学生学号：");
                    String id = sc.next();
                    selectbyid(st, id);
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("请输入需查询学生名字：");
                    String name = sc.next();
                    selectbyname(st, name);
                    break;
                case 3:
//                    全查询
                    for (int i = 0; i < st.size(); i++) {
                        Student student = st.get(i);
                        System.out.printf("学号:%s\n姓名:%s\n年龄:%d\n出生日:%s\n", student.getId(), student.getName(), student.getAge(), student.getBirth());
                        System.out.println("------------------------");
                    }
                    break;
//                    退出switch，返回到主选单
                case 4:
                    break;

            }
        }
    }

//    根据姓名查询
    private static void selectbyname(ArrayList<Student> st, String name) {
//        k用于判断是否不存在输入名字的学生
        int k=0;
        for (int i = 0; i < st.size(); i++) {
            Student student = st.get(i);
            if (student.getName().equals(name)) {
                System.out.println("------------------------");
                System.out.printf("学号:%s\n姓名:%s\n年龄:%d\n出生日:%s\n", student.getId(), student.getName(), student.getAge(), student.getBirth());
                k=1;
            }

        }
        if (k==0){
//                不存在时，调用select()方法，返回到查询选择页
            System.out.println("------------------------");
            System.out.println("不存在该学生，请检查输入是否正确！");
            select(st);
        }
    }

//    根据学号查询
    private static void selectbyid(ArrayList<Student> st, String id) {
//        c接收返回值，来判断id是否存在
        int c = checkid(st, id);
        if (c == 1) {
            for (int i = 0; i < st.size(); i++) {
                Student student = st.get(i);
                if (student.getId().equals(id)) {
                    System.out.println("------------------------");
                    System.out.printf("学号:%s\n姓名:%s\n年龄:%d\n出生日:%s\n", student.getId(), student.getName(), student.getAge(), student.getBirth());
                    break;
                }
            }
        } else {
            System.out.println("------------------------");
            System.out.println("该学生不存在，请检查输入是否正确!");
            select(st);
        }
    }
static void selectid(ArrayList<Student> st, String id){
    for (int i = 0; i < st.size(); i++) {
        Student student = st.get(i);
        if (student.getId().equals(id)) {

            System.out.printf("学号:%s\n姓名:%s\n年龄:%d\n出生日:%s\n", student.getId(), student.getName(), student.getAge(), student.getBirth());
            break;
        }
    }
}

}

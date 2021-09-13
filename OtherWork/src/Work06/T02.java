package Work06;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学员编号：");
        String id=sc.next();
        System.out.println("请输入学员姓名：");
        String name=sc.next();
        System.out.println("请输入学员性别：");
        String sex=sc.next();
        System.out.println("请输入学员身高：");
        double high=sc.nextDouble();
        System.out.println("请输入学员年龄：");
        Integer age=sc.nextInt();
        Student st=new Student(id,name,sex,high,age);
        System.out.println(st.getId()+" "+st.getName()+" "+st.getSex()+" "+st.getHigh()+" "+st.getAge());
    }
}

class Student{
    private String id;
    private String name;
    private String sex;
    private double high;
    private Integer age;

    public Student(String id, String name, String sex, double high, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.high = high;
        this.age = age;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
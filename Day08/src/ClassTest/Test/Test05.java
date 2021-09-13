package ClassTest.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String[] a =s.split("\\,");
        Student student=new Student(a[0],a[1]);
        student.show();
    }
}


class Student {
    private String name;
    private String age;

    public void show() {
        System.out.println(name + "---" + age);
    }

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

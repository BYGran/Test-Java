package ClassTest.DateDemo;

import java.util.Date;

public class Student {
    private String name;
    private Date birth;

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public Student(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public void show(){
        System.out.println(name+" "+birth);
    }
}

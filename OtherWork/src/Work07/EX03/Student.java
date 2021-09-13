package Work07.EX03;

public class Student extends Person{
    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student() {
        super();
    }

    @Override
    void eat() {
        System.out.println("学生吃饭");
    }
    void study(){
        System.out.println(this.getAge()+"岁的"+this.getName()+"在学习");
    }
}

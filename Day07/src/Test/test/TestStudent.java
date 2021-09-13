package Test.test;

public class TestStudent {
    /*
        JavaBean类 : 用于封装数据的类.

        1. 私有成员变量
        2. 提供空参带参构造方法
        3. 针对于每一个私有的成员变量, 提供对应的setXxx和getXxx方法.
     */
    public static void main(String[] args) {
        // 1. 无参构造方法创建对象, 通过setXxx给对象赋值.
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        System.out.println(stu1.getName() + "---" + stu1.getAge());

        // 2. 带参构造方法创建对象, 在创建对象的时候直接赋值.
        Student stu2 = new Student("李四",24);
        System.out.println(stu2.getName() + "---" + stu2.getAge());
    }
}


/*
    一个.java文件中, 可以编写多个class的
    1. 类与类之间要保证平级的关系
    2. 只能有一个class被public所修饰.

    ----------------------------------
    目前所面临的情况: 成员变量, 没有私有化, 数据使用者可以直接访问, 就有可能会赋值一些错误的数据.

    1. 将成员变量私有化
    2. 针对于私有的成员变量, 提供对应的setXxx和getXxx方法.
 */
class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}